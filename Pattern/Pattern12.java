import java.lang.*;
import java.util.*;
class Pattern12
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				int c=a+b;
				System.out.print(a+ " ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}

/*Enter a number:
5

0
1 1
2 3 5
8 13 21 34

*/