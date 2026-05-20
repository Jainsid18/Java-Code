import java.lang.*;
import java.util.*;
class LLRemoveAtIndex
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
	
	public static int removeFirst()
	{
		if(size==0){
			System.out.println("LinkedList is Empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1)
		{
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		else{
			int val=head.data;
			head=head.next;
			size--;
			return val;
		}
	}
	
	public static int removeLast(){
		if(size==0){
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1)
		{
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		Node prev=head;
		for(int i=0;i<size-2;i++)
		{
			prev=prev.next;
		}
		int val=prev.next.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
	
	public static int removeAtIndex(int idx)
	{
		if(idx<0 || idx>=size)
		{
			System.out.println("Invalid Index");
			return Integer.MIN_VALUE;
		}
		if(idx==0)
		{
			return removeFirst();
		}
		if(idx==size-1){
			return removeLast();
		}
		Node prev=head;
		for(int i=0;i<idx-1;i++)
		{
			prev=prev.next;
		}
		int val=prev.next.data;
		prev.next=prev.next.next;
		
		size--;
		return val;
	}
	
	public static void print(){
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
		LLRemoveAtIndex l1=new LLRemoveAtIndex();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.print();
		l1.addFirst(3);
		l1.addFirst(4);
		l1.print();
		
		System.out.println("Removed: " + l1.removeAtIndex(2));
        l1.print();
	}
}
	
