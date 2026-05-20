import java.lang.*;
import java.util.*;
class PalindromePattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			//space
			for(int j=1;j<=(a-i);j++)
			{
				System.out.print(" ");
			}
			//decreasing order
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			//increasing number
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
		