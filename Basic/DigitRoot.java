import java.lang.*;
import java.util.*;
class DigitRoot
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter a element in an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			while(arr[i]>9)
			{
				int lastDigit= arr[i] %10;
				int num= arr[i]/10;
				
				arr[i]=lastDigit + num;
			}
		}
		
		int lp=0;
		int rp=n-1;
		
		boolean palindrome=true;
		
		while(lp<rp)
		{
			if(arr[lp] !=arr[rp])
			{
				palindrome = false;
				break;
			}
			lp++;
			rp--;
		}
		
		if(palindrome)
		{
			System.out.println("Yes, the digit root array is a palindrome");
		}
	    else{
			System.out.println("No, the digit root array is not a palindrome");
		}
		
		System.out.println("Digit Root Array:");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}