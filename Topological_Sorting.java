import java.lang.*;
import java.util.*;
class Topological_Sorting
{
	public static class Edge{
		int dest;
		int src;
		
		public Edge(int src,int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	
	public static void createGraph(ArrayList<ArrayList<Edge>> graph,int V)
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

	public static void topSort(ArrayList<ArrayList<Edge>> graph){
		boolean vis[]=new boolean[graph.size()];
		Stack<Integer> s=new Stack<>();
		
		for(int i=0;i<graph.size();i++){
			if(!vis[i]){
				topSortUtil(graph,i,vis,s);
			}
		}
		while(!s.isEmpty()){
			System.out.println(s.pop() + " ");
		}
	}
	
	public static void topSortUtil(ArrayList<ArrayList<Edge>> graph,int curr,boolean vis[],Stack<Integer>s)
	{
		vis[curr]=true;
		
		for(int i=0;i<graph.get(curr).size();i++){
			Edge e=graph.get(curr).get(i);
			
			if(!vis[e.dest]){
				topSortUtil(graph,e.dest,vis,s);
			}
		}
		s.push(curr);
	}
		
	public static void main(String args[])
	{
		int V=6;
		ArrayList<ArrayList<Edge>> graph=new ArrayList<>();
		createGraph(graph,V);
		topSort(graph);
	}
}
