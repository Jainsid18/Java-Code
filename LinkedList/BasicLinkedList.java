import java.lang.*;
import java.util.*;
class BasicLinkedList
{
	static class Node{
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
	public static int size;
	
	public static void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			size++;
			return;
		}
		
		newNode.next=head;
		size++;
		head=newNode;
	}
	
	public static void addLast(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			size++;
			return;
		}
		tail.next=newNode;
		size++;
		tail=newNode;
	}
	
	public static void addIndex(int data,int idx)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			size++;
			return ;
		}
		if(idx < 0 || idx > size)
        {
          System.out.println("Invalid Index");
          return;
        }

		if(idx==0)
		{
			addFirst(data);
			return;
		}
		if(idx == size)
       {
         addLast(data);
         return;
       }
		Node prev=head;
		int i=0;
		while(i<idx-1)
		{
			prev=prev.next;
			i++;
		}
		newNode.next=prev.next;
		prev.next=newNode;
		size++;
	}
		
	
	public static void print()
	{
		if(head==null)
		{
			System.out.println("LL is empty");
			return;
		}
		Node newNode=head;
		while(newNode!=null)
		{
			System.out.print(newNode.data + "->");
			newNode=newNode.next;
		}
		System.out.print("null");
	}
	
	public static int removeFirst()
	{
		if(head==null)
		{
			System.out.print("LL is empty");
			return Integer.MIN_VALUE;
		}else if(size==1)
		{
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val= head.data;
		head=head.next;
		size--;
		return val;
	}
	
	public static int removeLast()
	{
		if(head==null)
		{
			System.out.print("LL is Empty");
			return Integer.MIN_VALUE;
		}else if(size==1)
		{
			int val= tail.data;
			head=tail=null;
			size=0;
			return val;
		}
		Node prev= head;
		for(int i=0;i<size-2;i++)
		{
			prev=prev.next;
		}
		int val=tail.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
		
	public static int removeAtIndex(int idx)
	{
		if(head==null)
		{
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}
		if(idx < 0 || idx >= size)
        {
          System.out.println("Invalid Index");
          return Integer.MIN_VALUE;
        }
		if(idx ==0)
		{
			return removeFirst();
		}
		if(idx == size-1)
		{
			return removeLast();
		}
		Node prev = head;
		for(int i=0; i<idx-1;i++){
			prev=prev.next;
		}
		int val= prev.next.data;
		prev.next=prev.next.next;
		
		size--;
		return val;
	}
		
	public static void removeNthFromEnd(int n)
	{
		if(head==null)
		{
			System.out.println("LL is Empty");
			return ;
		}

		int sz=0;
		Node temp=head;
		while(temp!=null)
		{
			sz++;
			temp=temp.next;
		}
		if(n==sz)
		{
			head=head.next;
			sz--;
			return;
		}
		int i=1;
		Node prev=head;
		
		while(i<sz-n)
		{
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		sz--;
		return;
	}
		
			
	
	public static void main(String args[])
	{
		BasicLinkedList ll = new BasicLinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addLast(3);
		ll.addLast(4);
		
		ll.addIndex(5,2);
		ll.addIndex(6,3);
		ll.removeFirst();
		ll.removeLast();
		ll.addFirst(5);
		ll.addIndex(8,4);
		ll.removeAtIndex(3);
		ll.print();
	}
}
		