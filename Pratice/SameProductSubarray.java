import java.lang.*;
import java.util.*;
class SameProductSubarray
{
	public static void main(String args[])
	{
		int arr[]={2,3,6,1};
		
		HashMap<Long,String> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			long product =1;
			
			for(int j=i;j<arr.length;j++)
			{
				product = product * arr[j];
				
				String subarray = " ";
				
				for(int k=i;k<=j;k++)
				{
					subarray = subarray + arr[k] + " ";
				}
				
				if(map.containsKey(product))
				{ 
					System.out.println("Subarray 1 : " + map.get(product));
					System.out.println("Subarray 2 : " + subarray);
					
					return;
				}
				
				map.put(product,subarray);
			}
		}
		
		System.out.println("No two subaary found" );
	}
}