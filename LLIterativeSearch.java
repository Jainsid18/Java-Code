import java.lang.*;
import java.util.*;
class LLIterativeSearch
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
	
	public static int iterativeSearch(int key)
	{
		int i=0;
	   Node temp=head;
	   while(temp!=null)
	   {
		   if(temp.data==key)
		   {
			   return i;
		   }
		   temp=temp.next;
		   i++;
	   }
	   return -1;
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
		LLIterativeSearch l1=new LLIterativeSearch();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.print();
		l1.addFirst(3);
		l1.addFirst(4);
		l1.print();
		
		System.out.println("KeyFound at " + iterativeSearch(3));
		System.out.println("KeyFound at " + iterativeSearch(7));

	}
}
	
