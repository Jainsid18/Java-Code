import java.lang.*;
import java.util.*;
class MatrixMultiplication
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
		
		System.out.println("Enter a number p:");
		int p=sc.nextInt();
		
		System.out.println("Enter a number q:");
		int q=sc.nextInt();
		
		int arr2[][]=new int[p][q];
		
		System.out.println("Enter elements in Array2:");
		
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		if(m==p)
		{	
	      int arr3[][] = new int[n][q];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<q;j++)
				{
					for(int k=0;k<m;k++)
					{
						arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
					}
				}
			}
			
		   System.out.println("Resultant Matrix :=");
		   for(int i=0;i<n;i++)
		   {
		    	for(int j=0;j<q;j++)
		    	{
			    	System.out.print(arr3[i][j]+ " ");
			    }
		    	System.out.println();
		    }
		}else{
			System.out.println("NOT POSSIBLE");
		}
		
	}
}