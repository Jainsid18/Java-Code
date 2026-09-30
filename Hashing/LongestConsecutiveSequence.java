import java.lang.*;
import java.util.*;
class LongestConsecutiveSequence
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
		
		HashMap<Integer,Boolean> hm = new HashMap<>();
		
		for(int val : arr1)
		{
			hm.put(val,true);
		}
		
		for(int val: arr1)
		{
			if(hm.containsKey(val-1))
			{
				hm.put(val,false);
			}
		}
		
		int msp=0;
		int ml=0;
		
		for(int val : arr1)
		{
			if(hm.get(val) ==true)
			{
				int tl=1;
				int tsp=val;
				
				while(hm.containsKey(tsp+tl))
				{
					tl++;
				}
				
				if(tl> ml)
				{
					msp=tsp;
					ml=tl;
				}
			}
		}
		
		for(int i=0;i<ml; i++)
		{
			System.out.println(msp + i);
		}
	}
}
		