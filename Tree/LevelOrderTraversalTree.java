import java.lang.*;
import java.util.*;
class LevelOrderTraversalTree
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
	
	public static void levelOrder(Node root)
	{
		if(root ==null)
		{
			return;
		}
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node curr = q.remove();
			System.out.print(curr.data + " ");
			
			if(curr.left !=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
	}
	
	
	public static void main(String args[])
	{
	    Node root=new Node(1);
        root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		levelOrder(root);
		
		
	}
}
