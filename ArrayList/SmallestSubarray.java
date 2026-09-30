import java.lang.*;
import java.util.*;
class SmallestSubarray
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a size of Array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter element in an  Array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value of K : ");
		int k=sc.nextInt();
		
	    /*HashMap<Integer,Integer> map=new HashMap<>();
		
		map.put(0,1);
		
		int sum=0;
		int ans=0;
		for(int j=0;j<n;j++)
		{
			sum = sum + arr[j];
			
			if(map.containsKey(sum-k))
			{
				ans= ans + map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		System.out.println(ans);*/
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		
		if(sum%k==0)
		{
			return ;
		}else 
		{
			int count=0;
		
			for(int i=0;i<n;i++)
			{
				int diff= sum - arr[i];
				if(diff%k==0)
				{
					count++;
				}
			}
			System.out.println(count);
		}
		
					
	}
}
		
		
