import java.lang.*;
import java.util.*;
class Pattern22
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--)
		{
			//space
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			//Decreasing number
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			//Increasing Number
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*Enter a number:
5
543212345
 4321234
  32123
   212
    1
	
*/


