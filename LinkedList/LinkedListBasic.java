import java.lang.*;
import java.util.*;
class LinkedListBasic
{
	public static class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
		   this.data=data;
		   this.next=null;
		}
	}
	
	public static int size;
	public static Node head;
	public static Node tail;
	
	public static void addFirst(int data)
	{
		Node newNode = new Node(data);
		size++;
		
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public static void addLast(int data)
	{
		Node newNode = new Node(data);
		size++;
		
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	public static void addAtIndex(int data, int idx)
	{
		if(idx==0)
		{
			addFirst(data);
			return;
		}
		if(idx==size)
		{
			addLast(data);
			return;
		}
		if(idx<0 || idx>size)
		{
			System.out.println("Invalid Index");
			return;
		}
		Node newNode = new Node(data);
		size++;
		
		Node temp=head;
		int i=0;
		
		while(i<idx-1)
		{
			temp=temp.next;
			i++;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	public static void print(){
		if(head==null)
		{
			System.out.print("LL is Empty");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	public  static int removeFirst()
	{
		if(head==null)
		{
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1){
			head=tail=null;
			size=0;
			return head.data;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	
	public static int removeLast()
	{
		if(head==null)
		{
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1){
			head=tail=null;
			size=0;
			return head.data;
		}
		
		Node prev=head;
		for(int i=0;i<size-2;i++)
		{
			prev=prev.next;
		}
		int val= prev.next.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
	
	public static int removeAtIndex(int idx)
	{
		if(idx<0 || idx>size)
		{
			System.out.println("Invalid Index");
			return Integer.MIN_VALUE;
		}
		if(idx==0)
		{
			return removeFirst();
		}
		if(idx==size)
		{
		   return removeLast();
		}
		Node prev= head;
		
		for(int i=0;i<idx-1;i++)
		{
			prev=prev.next;
		}
		int val= prev.next.data;
		prev.next=prev.next.next;
		size--;
		return val;
	}
	
	public static void removeNthFromEnd(int n)
	{
		int sz=0;
		Node temp=head;
		
		while(temp!=null)
		{
			sz++;
			temp=temp.next;
		}
		if(n==size)
		{
			head=head.next;
			return;
		}
		int i=1;
		Node prev= head;
		
		while(i<size-n)
		{
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return;
	}
			
	
	public static void main(String args[])
	{
		LinkedListBasic ll = new LinkedListBasic();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addAtIndex(7,3);
		
		ll.removeFirst();
		ll.removeLast();
		
		ll.addFirst(88);
		ll.addFirst(99);
		ll.addAtIndex(30,3);
		ll.addLast(20);
		
		ll.removeAtIndex(4);
		ll.removeNthFromEnd(3);
		
		ll.print();
		
		
	}
}

	