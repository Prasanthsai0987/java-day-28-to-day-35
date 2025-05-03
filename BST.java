package day29;


	class TNode{
		int d;
		TNode left,right;
		
		public TNode(int d) {
			this.d=d;
			right=left=null;
			
		}
	}
	public class BST {
	TNode root;
	
	TNode insert(int d, TNode root) {
		if(root==null) {
			
			root= new TNode(d);
			
		}else if (d<=root.d) {
			root.left=insert(d,root.left);
			
		}else
			root.right=insert(d,root.right);
		return root;
	}
	
	void inorder(TNode r) {
		if(r==null) {
			return;
		}
		inorder(r.left);
		System.out.println(r.d);
		inorder(r.right);
	}
	
	void rev_inorder(TNode root) {
		if(root==null) {
			return ;
		}
		else {
			rev_inorder(root.right);
			System.out.println(root.d);
			rev_inorder(root.left);
		}
	}
	
	
	int countNodes(TNode root) {
		
		if(root==null ) return 0;
		
		else {
			return countNodes(root.left)+countNodes(root.right)+1;
		}
	}
	
	public TNode Search(int data) {
		if(data==root.d) {
			return root;
		}
			TNode curr=root;
			while(curr!=null) {
				if(data==curr.d) {
					return curr;
				}
				else if(data<curr.d) {
					curr=curr.left;
				}else {
					curr=curr.right;
				}
		
		}
			return null;	
	}
	
	public TNode delete(TNode root,int data) {
		
		if(root==null) {
			return null;
			}
		
		if(data<root.d) {
			root.left=delete(root.left,data);
		}
		else if(data>root.d) {
			root.right=delete(root.right,data);
		}else {//data=root.d
			//case1 with no child
			if(root.right==null&& root.left==null) {
				return null;
			}
			//case with one child
			if(root.left==null) {
				return root.right;
			}
			if(root.right==null)
				return root.left;
			
			//case 3 with 2 childs
			
			TNode successer=findMin(root.right);
			root.d=successer.d;
			root.right=delete(root.right,successer.d);
		}
		
		return root;
		
	}
	


	TNode findMin(TNode root) {
		// TODO Auto-generated method stub
		while(root.left!=null) {
			root=root.left;
		}
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST obj=new BST();
		
		obj.root=obj.insert(20,obj.root);
		obj.root=obj.insert(30, obj.root);
		obj.root=obj.insert(50,obj.root);
		obj.root=obj.insert(80, obj.root);
		obj.root=obj.insert(60,obj.root);
		obj.root=obj.insert(10, obj.root);
		
		obj.inorder(obj.root);
		System.out.println();
		obj.rev_inorder(obj.root);
		System.out.println();
		TNode del=obj.delete(obj.root, 30);
		obj.inorder(obj.root);
		TNode res=obj.Search(30);
		if(res!=null) {
			System.out.println("found : "+res.d);
		}else System.out.println(res+"not found");
		 if (obj.root != null) {
		        System.out.println("Root Node: " + obj.root.d);
		    } 
		 System.out.print("no.of nodes: "+obj.countNodes(obj.root));
	}

}
