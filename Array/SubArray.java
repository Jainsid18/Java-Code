import java.lang.*;
import java.util.*;
class SubArray
{
	public static void printSubArray(int numbers[])
	{
		for(int i=0;i<numbers.length;i++)
		{
			int tp=0;
			int start=i;
			for(int j=i;j<numbers.length;j++)
			{
				int end=j;
				for(int k=start;k<=end;k++)
				{
					System.out.print(numbers[k] + " ");
				}
				tp++;
				System.out.println();
			}
			System.out.println("Total Subarray= " + tp); 
		}
	}
	
	public static void main(String args[])
	{
		int numbers[]={2,4,6,8,10};
		printSubArray(numbers);
	}
}