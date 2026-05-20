import java.lang.*;
import java.util.*;
class ButterFly
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			//first star
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			//space
			for(int j=1;j<=2*(a-i);j++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=a;i>=1;i--)
		{
			//first star
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			//space
			for(int j=1;j<=2*(a-i);j++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}