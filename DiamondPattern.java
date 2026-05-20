import java.lang.*;
import java.util.*;
class DiamondPattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			//space
			for(int j=1;j<a-i;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd Half
		for(int i=a;i>=1;i--)
		{
			//space
			for(int j=1;j<a-i;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}