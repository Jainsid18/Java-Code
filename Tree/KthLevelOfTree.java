import java.lang.*;
import java.util.*;
class KthLevelOfTree
{
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}
	
	public static void kthlevel(Node root,int k,int level)
	{
		if(root==null)
		{
			return;
		}
		if(k==level){
			System.out.print(root.data + " ");
		}
		kthlevel(root.left,k,level+1);
		kthlevel(root.right,k,level+1);
	}
	
	public static void main(String args[])
	{
		Node root= new Node(1);
		root.left=new Node(2);
		root.right = new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		int K=3;
		kthlevel(root,K,1);
	}
}