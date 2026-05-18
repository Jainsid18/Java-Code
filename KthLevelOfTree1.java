import java.lang.*;
import java.util.*;
class KthLevelOfTree1
{
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static void kthlevel(Node root,int k)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		int level=1;
	
		while(!q.isEmpty())
		{
			int size=q.size();
			if(level==k)
		     {
				 while(size-- >0){
					 Node curr=q.remove();
		    	    System.out.print(curr.data+ " ");
				 }
				 return;
		     }
			 
			 while(size-->0){
				 Node curr=q.remove();
				 
			     if(curr.left!=null)
			     {
			    	q.add(curr.left);
		        	}
			    if(curr.right!=null)
			    {
			    	q.add(curr.right);
			    }
				
			 }
			 level++;
		}
	}
	
	public static void main(String args[])
	{
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right = new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		System.out.print("Kth level nodes: ");
        kthlevel(root, 3);
	}
}