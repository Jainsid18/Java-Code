import java.lang.*;
import java.util.*;
class PostorderTree
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
	
	public static class BinaryTree{
		static int idx=-1;
		
		public static Node builtTree(int nodes[])
		{
			idx++;
			
			if(nodes[idx] ==-1){
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left=builtTree(nodes);
			newNode.right=builtTree(nodes);
			
			return newNode;
		}
		
		public static void postOrder(Node root)
		{
			if(root == null)
			{
				return ;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public static void main(String args[])
	{
		int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.builtTree(nodes);
		  tree.postOrder(root);
	}
}