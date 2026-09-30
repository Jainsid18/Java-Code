import java.lang.*;
import java.util.*;
class RootChain
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n= sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter element in an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			while(arr[i]>9)
			{
				int lastDigit= arr[i]%10;
				int num= arr[i]/10;
				arr[i]=num + lastDigit;
			}
		}
		
		boolean palindrome=true;
		int lp=0;
		int rp=n-1;
		
		while(lp<rp)
		{
			if(arr[lp]!=arr[rp])
			{
				palindrome=false;
			}
			lp++;
			rp--;
		}
		
		System.out.println("Digital  roots :");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		if(palindrome)
		{
			System.out.println("Yes,the digital root array is  a palindrome");
		}else{
			System.out.println("No,the digital root array is not a palindrome");
		}
		
	
	}
}
			