import java.lang.*;
import java.util.*;
class SumSubArray
{
	public static void sumArray(int numbers[])
	{
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
					System.out.print(numbers[k] + " ");
				}
				System.out.print("Sum is : " + sum);
				System.out.println();
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[])
	{
		int numbers[]={2,4,6,8,10};
		sumArray(numbers);
	}
}

