package day28;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}


class InsertionSLL {
    
    public Node insert(int key, int pos, Node head) {
        Node newNode = new Node(key);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp1 = head;
            
            for (int i = 1; temp1 != null && i < pos - 1; i++) {
                temp1 = temp1.next; // Fixed the incomplete statement
            }
            
            if (temp1 == null) {
                System.out.println("Position out of bounds!");
                return head;
            }
            
            newNode.next = temp1.next;
            temp1.next = newNode;
        }
        return head;
    }
    public void printList(Node head) {
    	Node temp=head;
    	int c=0;
    	while(temp!=null) {
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    		c++;
    	}
    	System.out.println("number of nodes"+c+"]");
    }
    
    public Node delAtPos(int pos, Node head) {
    	if(pos==1) {
    		head=head.next;
    		}else {
    			Node temp1=head;
    			Node prev=null;
    		
    		for(int i=1;temp1!=null && i<pos;i++) {
    			prev =temp1;
    			temp1=temp1.next;
    			
    		}
    		prev.next=temp1.next;
    		}
    	return head;
    }


	public static void main(String[] args) {
		
		InsertionSLL  list=new InsertionSLL();
		Node head=null;
		System.out.println("Inserting ");
		head  =list.insert(10,1,head);
		head =list.insert(20,2, head);
		list.printList(head);
	}

}
