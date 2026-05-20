import java.lang.*;
import java.util.*;
class LLNthNode
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
	
    public static void removeNthFromEnd(int n)
	{
		int sz=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			sz++;
		}
		if(n>sz)
		{
			 System.out.println("Invalid n");
             return;
		}
		if(n==sz)
		{
			head=head.next;
			if(head==null){
				tail=null;
			}
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
		
		if(prev.next==null)
		{
			tail=prev;
		}
		return ;
	}
		
	public static void main(String args[])
	{
		LLNthNode l1=new LLNthNode();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(3);
		l1.addFirst(4);
		l1.print();
	    l1.removeNthFromEnd(3);
		l1.print();
		

	}
}
	
