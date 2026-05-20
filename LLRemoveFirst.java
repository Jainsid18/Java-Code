   import java.lang.*;
import java.util.*;
class LLRemoveFirst
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
		LLRemoveFirst l1=new LLRemoveFirst();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(3);
		l1.addFirst(4);
		l1.print();
		
		System.out.println("Removed: " + l1.removeFirst());
        l1.print();
	}
}
	
