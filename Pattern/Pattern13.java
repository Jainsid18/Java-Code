import java.lang.*;
import java.util.*;
class Pattern13
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int val=1;
			for(int j=0;j<=i;j++)
			{
			   System.out.print(val + " ");
			   val=val*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}

/*Enter a number:
5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1

*/