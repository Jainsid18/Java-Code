import java.lang.*;
import java.util.*;
class LLAddLast
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
	
	public static void addLast(int data)
	{
		Node newNode=new Node(data);
		size++;
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	public static void print(){
		if(head==null){
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
		LLAddLast l1=new LLAddLast();
		l1.addLast(1);
		l1.addLast(2);
		l1.print();
		
		l1.addLast(3);
		l1.addLast(4);
		l1.print();
	}
}
