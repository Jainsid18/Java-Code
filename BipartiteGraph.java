import java.lang.*;
import java.util.*;
class BipartiteGraph
{
	public static class Edge{
		int src;
		int dest;
		
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
		
		graph.get(0).add(new Edge(0,1));
		graph.get(0).add(new Edge(0,2));
		
		graph.get(1).add(new Edge(1,0));
		graph.get(1).add(new Edge(1,3));
		
		graph.get(2).add(new Edge(2,0));
		graph.get(2).add(new Edge(2,4));
		
		graph.get(3).add(new Edge(3,1));
		graph.get(3).add(new Edge(3,4));
		
		graph.get(4).add(new Edge(4,3));
		graph.get(4).add(new Edge(4,2));
	}
	
	public static boolean bipartite(ArrayList<ArrayList<Edge>>graph)
	{
		int col[]=new int[graph.size()];
		for(int i=0;i<col.length;i++)
		{
			col[i]=-1;
		}
		
		Queue<Integer>q=new LinkedList<>();
		
		for(int i=0;i<graph.size();i++)
		{
			if(col[i]==-1){
				q.add(i);
				col[i]=0;
				
				while(!q.isEmpty())
				{
					int curr=q.remove();
					for(int j=0;j<graph.get(curr).size();j++)
					{
						Edge e=graph.get(curr).get(j);
						
						if(col[e.dest]==-1){
							int nextCol=col[curr]==0?1:0;
							col[e.dest]=nextCol;
							q.add(e.dest);
						}
						else if(col[e.dest]==col[curr])
						{
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		int V=5;
		ArrayList<ArrayList<Edge>>graph=new ArrayList<>();
		createGraph(graph,V);
		System.out.println(bipartite(graph));
	}
}
		
