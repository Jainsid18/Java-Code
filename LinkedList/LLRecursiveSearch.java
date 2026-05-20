import java.lang.*;
import java.util.*;
class LLRecursiveSearch
{
	public static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	public static void addFirst(int data)
	{
		Node newNode=new Node(data);
		size++;
		if(head==null){
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public static int searchKey(int key)
	{
		return helper(head,key);
	}
	
	public static int helper(Node head, int key)
	{
		if(head==null)
		{
			return -1;
		}
		if(head.data==key)
		{
			return 0;
		}
		int idx= helper(head.next,key);
		
		if(idx==-1)
		{
			return -1;
		}
		return idx+1;
	}

	public void print(){
		if(head==null)
		{
			System.out.println("LinkedList is Empty");
			return;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
		
		
	public static void main(String args[])
	{
		LLRecursiveSearch l1=new LLRecursiveSearch();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.print();
		l1.addFirst(3);
		l1.addFirst(4);
		l1.print();
		
		System.out.println("KeyFound at " + searchKey(3));
		System.out.println("KeyFound at " + searchKey(7));

	}
}
	
