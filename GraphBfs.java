package day33;

import java.util.*;
public class GraphBfs {
	
	int vertices;
	LinkedList<Integer>[] adjlist;
	
	public GraphBfs(int v) {
		this.vertices=v;
		adjlist=new LinkedList[v];
		
		for(int i=0;i<v;i++) {
			adjlist[i]=new LinkedList<>();
		}
		
	}
	
	public void addEdge(int src, int dest) {
		
		adjlist[src].add(dest);
		adjlist[dest].add(src);
	}
	
	public void bfs(int stn) {
		
		boolean[] visited=new boolean[vertices]; 
		Queue<Integer> q=new LinkedList<>();
		
		visited[stn]=true;
		q.add(stn);
		
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.print(node+" ");
			
			for(int neighbour:adjlist[node]) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					q.add(neighbour);
				}
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphBfs g=new GraphBfs(6);
		
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(3,2);
		g.addEdge(2,4);
		g.addEdge(2,1);
		
		g.bfs(0);
		
		
	}

}
