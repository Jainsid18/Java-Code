import java.lang.*;
import java.util.*;
class KadaneAlgo
{
	public static void Kadane(int numbers[])
	{
		int maxNum=Integer.MIN_VALUE;
		int currSum=0;
		
		for(int i=0;i<numbers.length;i++)
		{
			currSum=currSum + numbers[i];
			if(currSum<0)
			{
				currSum=0;
			}
			maxNum=Math.max(currSum,maxNum);
		}
		System.out.println("Our max subarray is: " + maxNum);
	}
	
	public static void main(String args[])
	{
		int numbers[]={2,4,6,8,10};
		Kadane(numbers);
	}
}