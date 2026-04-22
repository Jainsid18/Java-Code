import java.lang.*;
import java.util.*;
class 	CreateGraph
{
	public static class Edge{
		int src;
		int dest;
		int wt;
		
		public Edge(int src, int dest,int wt){
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	
	public static void main(String args[])  
	{
		int V=5;
		
		ArrayList<ArrayList<Edge>>graph =new ArrayList<>();
		
		for(int i=0;i<V;i++)
		{
			graph.add(new ArrayList<>());
		}
		
		//0-vertex
		graph.get(0).add(new Edge(0,1,5));
		//1-vertex
		graph.get(1).add(new Edge(1,0,5));
		graph.get(1).add(new Edge(1,2,1));
		graph.get(1).add(new Edge(1,3,3));
		//2-vertex
		graph.get(2).add(new Edge(2,4,2));
		graph.get(2).add(new Edge(2,3,1));
		graph.get(2).add(new Edge(2,1,1));
		//3-vertex
		graph.get(3).add(new Edge(3,1,3));
		graph.get(3).add(new Edge(3,2,1));
		//4-vertex
		graph.get(4).add(new Edge(4,2,2));
		
	    //print
		for(int i=0;i<V;i++)
		{
			System.out.print(i + " -> ");
			for(int j=0;j<graph.get(i).size();j++)
			{
				Edge e=graph.get(i).get(j);
				System.out.print(" (" + e.dest + " ," + e.wt + ")");
			}
			System.out.println();
		}
		
		//2nd's neighbour
		System.out.print("Neighbours of 2 " +  " are: ");
		for(int i=0;i<graph.get(2).size();i++)
		{
			Edge e=graph.get(2).get(i);
			System.out.print(e.dest + " ");
		}
			
	}
}
		
		
		
			
