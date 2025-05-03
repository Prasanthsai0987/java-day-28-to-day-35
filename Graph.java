package day33;

 class Graph {
	
	 static int vertices;
	 static int[][] adjacencyMatrix;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph obj=new Graph(5);
		
		Graph.addEdge(0, 4);
        obj.addEdge(1, 2);
        obj.addEdge(1, 3);
        obj.addEdge(1, 4);
        obj.addEdge(2, 3);
        obj.addEdge(3, 4);
		
		obj.show(5);
	
	}
	public static void show(int vertices) {
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(adjacencyMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	static void addEdge(int st, int end) {
		
		adjacencyMatrix[st][end]=1;
		adjacencyMatrix[end][st]=1;
		
	}
	
	
	public  Graph(int vertices) {
		
		this.vertices=vertices;
		adjacencyMatrix=new int[vertices][vertices];
		
	}
	

}

 
 
 //visited or not visited
 
 