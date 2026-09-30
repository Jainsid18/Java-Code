import java.lang.*;
import java.util.*;
class MathsRandom
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int previous= (int)(Math.random()*100);
		
		int currentCount = 1;
		int largestCount = 1;
		
		System.out.println(previous + " ");
		
		int i=1;
		
		while(i<n)
		{
			int current = (int)(Math.random()*100);
			System.out.print(current + " ");
			
			if(current>previous)
			{
				currentCount++;
			}
			if(currentCount>largestCount)
			{
				largestCount=currentCount;
			}else{
				currentCount=1;
			}
			previous = current;
			i++;
		}
		
		System.out.println("\nLargest consecutive increasing count " + largestCount);
	}
}