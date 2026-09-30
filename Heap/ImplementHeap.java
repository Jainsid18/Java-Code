import java.lang.*;
import java.util.*;
class ImplementHeap
{
	static class Heap 
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		public void add(int data)
		{
			arr.add(data);
			
			int x= arr.size()-1;
			int par = (x-1)/2;
			
			while(x>0 && arr.get(x)<arr.get(par))
			{
				//swap
				int temp= arr.get(x);
				arr.set(x,arr.get(par));
				arr.set(par,temp);
				
				//move upward
				x=par;
				par = (x-1)/2;
			}
		}
		
		public void printHeap()
		{
			System.out.println(arr);
		}
		
		public int remove()
		{
			if(arr.size()==0)
			{
				return -1;
			}
			
			int data = arr.get(0);
			
			arr.set(0,arr.get(arr.size()-1));
			
			arr.remove(arr.size()-1);
			
			if(arr.size()>0)
			{
				heapify(0);
			}
			
			return data;
		}
		
		public void heapify(int i)
		{
			int left= 2*i+1;
			int right = 2*i+2;
			int minIdx = i;
			
			if(left<arr.size() && arr.get(left)<arr.get(minIdx))
			{
				minIdx=left;
			}
			
			if(right<arr.size() && arr.get(right)<arr.get(minIdx))
			{
				minIdx=right;
			}
			
			if(minIdx!=i)
			{
				int temp = arr.get(i);
				arr.set(i,arr.get(minIdx));
				arr.set(minIdx,temp);
				
				heapify(minIdx);
			}
		}
		
		public int peek()
		{
			return arr.get(0);
		}
	}
	
	
	public static void main(String args[])
	{
		Heap h= new Heap();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(2);
		h.add(5);
		h.add(35);
		
		h.printHeap();
	}
}