import java.lang.*;
import java.util.*;
class LLAddIndex
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
	
	public static Node tail;
	public static Node head;
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
	
	public static void addIndex(int idx,int data)
	{	
		if(idx<0 || idx>size){
			System.out.println("Invalid Index");
			return;
		}
		
		if(idx==0)
		{
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		Node temp=head;
		int i=0;
		
		while(i<idx-1){
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
		if(newNode.next==null){
			tail=newNode;
		}
		
		size++;
	}
			
	public static void print(){
		if(head==null)
		{
			System.out.println("LinkedList is Empty");
			return;
		}
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
		LLAddIndex l1=new LLAddIndex();
		l1.addIndex(0,0);
		l1.addIndex(1,1);
		l1.addIndex(2,2);
		l1.addIndex(3,3);
		l1.print();
	}
}
