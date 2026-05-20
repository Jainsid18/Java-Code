import java.lang.*;
import java.util.*;
class BFSGraph
{
	public static class Edge{
		int src;
		int dest;
		
		public Edge(int src,int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	
	public static void bfs(ArrayList<ArrayList<Edge>> graph)
	{
		Queue<Integer> q=new LinkedList<>();
		
		boolean vis[]=new boolean[graph.size()];
		q.add(0);
		
		while(!q.isEmpty()){
			int curr=q.remove();
			
			if(!vis[curr]){
				System.out.print(curr + " ");
				vis[curr]=true;
				for(int i=0;i<graph.get(curr).size();i++)
				{
					Edge e=graph.get(curr).get(i);
					q.add(e.dest);
				}
			}
		}
	}
	public static void main(String args[])
	{
		int V=7;
		
		ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
		createGraph(graph,V);
		bfs(graph);
	}
		
	public static void createGraph(ArrayList<ArrayList<Edge>> graph,int V)
	{
		
		for(int i=0;i<V;i++)
		{
			graph.add(new ArrayList<>());
		}
		
		//0-vertex
		graph.get(0).add(new Edge(0,1));
		graph.get(0).add(new Edge(0,2));
		//1-vertex
		graph.get(1).add(new Edge(1,0));
		graph.get(1).add(new Edge(1,3));
		//2-vertex
		graph.get(2).add(new Edge(2,0));
		graph.get(2).add(new Edge(2,4));
		//3-vertex
		graph.get(3).add(new Edge(3,1));
		graph.get(3).add(new Edge(3,4));
		graph.get(3).add(new Edge(3,5));
		//4-vertex
		graph.get(4).add(new Edge(4,2));
		graph.get(4).add(new Edge(4,3));
		graph.get(4).add(new Edge(4,5));
		//5-vertex
		graph.get(5).add(new Edge(5,3));
		graph.get(5).add(new Edge(5,4));
		graph.get(5).add(new Edge(5,6));
		//6-vertex
		graph.get(6).add(new Edge(6,5));
	}
}
	
