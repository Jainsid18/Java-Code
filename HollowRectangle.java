import java.lang.*;
import java.util.*;
class HollowRectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int a=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int b=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if(i==0 || i==a-1 || j==0 || j==b-1){
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
		