import java.lang.*;
import java.util.*;
class SubTree
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
	
	public static boolean isSubTree(Node root,Node subroot)
	{
		if(root==null)
		{
			return false;
		}
		if(subroot.data==root.data)
		{
			if(isIdentical(root,subroot))
			{
				return true;
			}
		}
		boolean leftAns = isSubTree(root.left,subroot) ;
        boolean rightAns =isSubTree(root.right,subroot);
		
		return leftAns || rightAns;
	}
	
	public static boolean isIdentical(Node root,Node subroot)
	{
		if(root==null && subroot==null)
		{
			return true;
		}
		else if(root ==null || subroot == null || root.data != subroot.data)
		{
			return false;
		}
		if(!isIdentical(root.left,subroot.left))
		{
			return false;
		}
		if(!isIdentical(root.right,subroot.right)){
			return false;
		}
		return true;
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
		
		Node subroot= new Node(2);
		subroot.left=new Node(4);
		subroot.right=new Node(5);
		
		System.out.println(isSubTree(root,subroot));
	}
}