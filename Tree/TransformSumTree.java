import java.lang.*;
import java.util.*;
class TransformSumTree
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
	
	public static int TransformSum(Node root )
	{
		if(root==null)
		{
			return 0;
		}
		
		int leftChild= TransformSum(root.left);
		int rightChild=TransformSum(root.right);
		
		int data=root.data;
		
		root.data = leftChild +rightChild;
		
		return root.data + data;
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
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
		
		TransformSum(root);
		preorder(root);
	}
}