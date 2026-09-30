import java.lang.*;
import java.util.*;
class WaveMatrix
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number n:");
		int n=sc.nextInt();
		
		System.out.println("Enter a number m:");
		int m=sc.nextInt();
		
		int arr1[][]=new int[n][m];
		
		System.out.println("Enter elements in Array1:");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Wave Matrix:");
		
		for(int j=0;j<m;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<n;i++)
				{
					System.out.println(arr1[i][j] + " ");
				}
			}else{
				for(int i=n-1;i>=0;i--)
				{
					System.out.println(arr1[i][j] + " ");
				}
			}
		}
		
	}
}
			