import java.lang.*;
import java.util.*;
class Pattern8
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
				if((i+j)==n-1)
				{
				   System.out.println("*");
				}else{
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

   *

  *

 *

*


*/