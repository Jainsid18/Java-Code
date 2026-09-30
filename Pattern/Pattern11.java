import java.lang.*;
import java.util.*;
class Pattern11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n=sc.nextInt();
		int count=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}

/*Enter a number:
5

1
2 3
4 5 6
7 8 9 10

*/