import java.lang.*;
import java.util.*;
class DeletionInHeap
{
	static class Heap
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		public void add(int data)
		{
			//add at last idx
			arr.add(data);
			
			int x= arr.size()-1; //x is child index
			int par =(x-1)/2; //par index
			
			while(x>0 && arr.get(x) < arr.get(par))
			{
				//swap
				int temp = arr.get(x);
				arr.set(x,arr.get(par));
				arr.set(par,temp);
				
				 // Move upward
                x = par;
                par = (x - 1) / 2;
			}
		}
		
		public void printHeap() {
            System.out.println(arr);
        }
		
		public void heapify(int i)
		{
			int left = 2*i +1;
			int right = 2*i +2;
			
			int minIdx = i;
			
			if(left<arr.size() && arr.get(left) < arr.get(minIdx)){
				minIdx = left;
			}
			
			if (right < arr.size() && arr.get(right) < arr.get(minIdx))
			{
               minIdx = right;
            }
			
		     if (minIdx != i)
			 {
				 //swap
               int temp = arr.get(i);
               arr.set(i, arr.get(minIdx));
               arr.set(minIdx, temp);

               heapify(minIdx);
			 }
		}

		public int remove()
		{
			if(arr.size() ==0)
			{
				return -1;
			}
			
			//step 1 : save root
			int data = arr.get(0);
			
			//step 2: Replace root with last element
			arr.set(0,arr.get(arr.size()-1));
			
			//step 3 : Remove last element
			arr.remove(arr.size()-1);
			
			//step 4 : Heapify
			if(arr.size()>0){
				heapify(0);
			}
			
			return data;
		}
	}
	public static void main(String args[])
	{

    Heap h = new Heap();

    h.add(10);
    h.add(20);
    h.add(5);
    h.add(30);
    h.add(2);

    h.printHeap();

    System.out.println("Deleted : " + h.remove());

    h.printHeap();
	}
}
			