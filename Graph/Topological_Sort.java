import java.lang.*;
import java.util.*;
class Topological_Sort
{
	static class Edge
	{
		int dest;
		int src;
		
		public Edge(int src,int dest)
		{
			this.src=src;
			this.dest=dest;
		}
	}
	
	public static void createGraph(ArrayList<ArrayList<Edge>>graph,int V)
	{
		for(int i=0;i<V;i++)
		{
			graph.add(new ArrayList<>());
		}
		
		graph.get(2).add(new Edge(2,3));
		graph.get(3).add(new Edge(3,1));
		graph.get(4).add(new Edge(4,1));
		graph.get(4).add(new Edge(4,0));
		graph.get(5).add(new Edge(5,0));
		graph.get(5).add(new Edge(5,2));
	}
	
	public static void calcIndeg(ArrayList<ArrayList<Edge>>graph,int indeg[])
	{
		for(int i=0;i<graph.size();i++)
		{
			int v=i;
			for(int j=0;j<graph.get(v).size();j++)
			{
				Edge e=graph.get(v).get(j);
				indeg[e.dest]++;
			}
		}
	}
	
	public static void topSort(ArrayList<ArrayList<Edge>>graph)
	{
		int indeg[]=new int[graph.size()];
		calcIndeg(graph,indeg);
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=0;i<indeg.length;i++)
		{
			if(indeg[i]==0){
				q.add(i);
			}
		}
		
		while(!q.isEmpty())
		{
			int curr=q.remove();
			System.out.print(curr + " ");
			
			for(int i=0;i<graph.get(curr).size();i++)
			{
				Edge e= graph.get(curr).get(i);
				
				indeg[e.dest]--;
				
				if(indeg[e.dest]==0)
				{
					q.add(e.dest);
				}
			}
		}
		System.out.println();
	}
		
	
	public static void main(String args[])
	{
		int V=6;
		ArrayList<ArrayList<Edge>>graph=new ArrayList<>();
		createGraph(graph,V);
		topSort(graph);
	}
}
	
