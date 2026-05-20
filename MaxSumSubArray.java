import java.lang.*;
import java.util.*;
class MaxSumSubArray
{
	public static void sumArray(int numbers[])
	{
		int maxSum= Integer.MIN_VALUE;
		int minSum= Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++)
		{
			int start=i;
			for(int j=i;j<numbers.length;j++)
			{
				int end=j;
				int sum=0;
				for(int k=start;k<=end;k++)
				{
					sum= sum+ numbers[k];
				}
				System.out.println();
				if(sum>maxSum){
					maxSum=sum;
				}if(sum<minSum)
				{
					minSum=sum;
				}
			}
			System.out.println();
		}
		System.out.println("Maximum sum is : "+ maxSum);
		System.out.println("Minimum sum is : " + minSum);
	}
	
	
	public static void main(String args[])
	{
		int numbers[]={2,4,6,8,10};
		sumArray(numbers);
	}
}

