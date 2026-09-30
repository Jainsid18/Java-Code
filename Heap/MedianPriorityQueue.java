import java.lang.*;
import java.util.*;
class MedianPriorityQueue
{
	public static class Median{
		
		PriorityQueue<Integer> left;
		PriorityQueue<Integer> right;
		
		public Median(){
			left= new PriorityQueue<>(Collections.reverseOrder());
			right = new PriorityQueue<>();
		}
		
		public void add(int val)
		{
			if(right.size()>0 && val>right.peek())
			{
				right.add(val);
			}else{
				left.add(val);
			}
			
			if(left.size() - right.size() ==2)
			{
				right.add(left.remove());
			}else if(right.size()- left.size() ==2)
			{
				left.add(right.remove());
			}
		}
		
		public int remove()
		{
			if(this.size()==0)
			{
				System.out.println("Underflow");
				return -1;
			}
			
			if(left.size() >=right.size())
			{
				return left.remove();
			}else{
				return right.remove();
			}
		}
		
		public int peek()
		{
			if(this.size()==0)
			{
				System.out.println("Underflow");
				return -1;
			}
			
			if(left.size() >=right.size())
			{
				return left.peek();
			}else{
				return right.peek();
			}
		}
		
		public int size()
		{
			return left.size() + right.size();
		}
		
	}
	
	
	public static void main(String args[])
	{
		Median mpq = new Median();
		
		mpq.add(10);
		mpq.add(20);
		mpq.add(30);
		mpq.add(40);
		mpq.add(50);
		
		System.out.println("Median:" + mpq.peek());
		System.out.println("Removed: " + mpq.remove());
        System.out.println("Median: " + mpq.peek());
	}
}