import java.lang.*;
import java.util.*;
class InsertInHeap
{
	static class Heap{
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
		
		public int peek(){
			return arr.get(0);
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
		System.out.println(h.peek());
    }
}
			