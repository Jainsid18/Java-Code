import java.lang.*;
import java.util.*;
class KLargestElement
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Size of an Array : ");
		int n= sc.nextInt();
		
		int arr1[]= new int[n];
		System.out.println("Enter element of Array : ");
		
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Value of K : ");
		int k= sc.nextInt();
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			if(i<k)
			{
				pq.add(arr1[i]);
			}else{
			   if(arr1[i]>pq.peek())
			   {
				   pq.remove();
				   pq.add(arr1[i]);
			   }
			}
		}
		
		while(pq.size()>0)
		{
			System.out.println(pq.peek());
			pq.remove();
		}
	}
}