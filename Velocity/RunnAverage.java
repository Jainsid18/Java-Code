import java.lang.*;
import java.util.*;
class RunnAverage
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
		
		int num[] = new int[n];
		
		int sum=arr[0];
		num[0]= arr[0];
		for(int i=1;i<n;i++)
		{
			sum=sum+arr[i];
			int avg= sum/(i+1);
			num[i]=avg;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num[j]+ " ");
			}
			System.out.println();
		}
	}
}
