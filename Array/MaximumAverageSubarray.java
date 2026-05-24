import java.lang.*;
import java.util.*;
class MaximumAverageSubarray
{
	public static double findMaxAverage(int nums[],int k)
	{
		double maxAvg = Integer.MIN_VALUE;
		
		for(int i=0;i<=nums.length-k;i++)
		{
			int sum=0;
			
			for(int j=i;j<i+k;j++)
			{
				sum= sum + nums[j];
			}
			double avg = (double)sum/k;
			maxAvg=Math.max(maxAvg,avg);
		}
		return maxAvg;
	}
			
	
	public static void main(String args[])
	{
		int nums[]={1,12,-5,-6,50,3};//6
		int k=4;
		
		System.out.print(findMaxAverage(nums,k));
	}
}