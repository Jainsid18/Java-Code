import java.lang.*;
import java.util.*;
class DiagonalTraversal
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int n=sc.nextInt();
		
		System.out.println("Enter number of columns:");
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
		
		System.out.println("Enter elements:");
		 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("So Diagonal Elements are :");
		for(int g=0;g<n;g++)
		{
			for(int i=0,j=g; i<n && j<m;i++,j++)
			{
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}
		
		