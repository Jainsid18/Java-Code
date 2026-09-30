import java.lang.*;
import java.util.*;
class SmallestSubarray
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter element in an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter value of K:");
		int k=sc.nextInt();
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		
		if(sum%k==0)
		{
			return;
		}else{
			int count=0;
			
			for(int i=0;i<n;i++)
			{
				int diff= sum-arr[i];
				if(diff%k==0)
				{
					count++;
				}
			}
			System.out.println("Minimum Subarray Length: " +count);
		}
	}
}