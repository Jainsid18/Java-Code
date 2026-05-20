import java.lang.*;
import java.util.*;
class OptimizeKadane
{
	public static void Kadane(int numbers[])
	{
		int maxSum=numbers[0];
		int currSum= numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			currSum = Math.max(numbers[i] , currSum + numbers[i]);
			maxSum = Math.max(currSum,maxSum);
		}
		System.out.println("Our max Subarray sum is : " + maxSum);
	}
	
	public static void main(String args[])
	{
		int numbers[]={ -2,-3,-4,-1,-2,-1,-5,-3};
		Kadane(numbers);
	}
}
