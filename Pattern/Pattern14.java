import java.lang.*;
import java.util.*;
class Pattern14
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int val=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			
			int cval=val;
			
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(cval + " ");
				if(j<i)
				{
					cval++;
				}else{
					cval--;
				}
			}
			val++;
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			
			int cval=i;
			
			for(int j=1;j<=(2*i)-1;j++)
			{
			   System.out.print(cval + " ");
				if(j<i)
				{
					cval++;
				}else{
					cval--;
				}
			}
			System.out.println();
		}
	}
}

/*Enter a number:
5
    1
   2 3 2
  3 4 5 4 3
 4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 4 5 6 7 6 5 4
  3 4 5 4 3
   2 3 2
    1
	
*/