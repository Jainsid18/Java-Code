import java.lang.*;
import java.util.*;
class MergeTwoLL
{
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	public static Node merge(Node newNode1, Node newNode2)
	{
		Node dummy= new Node(-1);
		Node temp = dummy;
		
		while(newNode1!=null && newNode2!=null)
		{
			if(newNode1.data <newNode2.data)
			{
				temp.next= newNode1;
				newNode1= newNode1.next;
			}else{
				temp.next= newNode2;
				newNode2= newNode2.next;
			}
			temp=temp.next;
		}
		
		if(newNode1!=null)
		{
			temp.next=newNode1;
		}
		if(newNode2!=null)
		{
			temp.next=newNode2;
		}
		return dummy.next;
	}
	
	public static void printF(Node head)
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[])
	{
		Node newNode1= new Node(1);
		newNode1.next= new Node(3);
		newNode1.next.next= new Node(5);
		newNode1.next.next.next = new Node(7);
		
		Node newNode2= new Node(2);
		newNode2.next = new Node(4);
		newNode2.next.next = new Node(6);
		newNode2.next.next.next = new Node(8);
		
		head=merge(newNode1,newNode2);
		printF(head);
		
	}
}
		
		