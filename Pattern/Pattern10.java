import java.lang.*;
import java.util.*;
class Pattern10
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(((i+j)==(n/2)) || ((i-j)==n/2) || ((j-i)==n/2) || (i+j)==3*(n/2))
				{
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

/*Enter a number:
5
  *
 * *
*   *
 * *
  *
  
*/