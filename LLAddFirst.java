import java.lang.*;
import java.util.*;
class LLAddFirst
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
		LLAddFirst l1=new LLAddFirst();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.print();
		l1.addFirst(3);
		l1.addFirst(4);
		l1.print();
	}
}
	
