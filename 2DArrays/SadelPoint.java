import java.lang.*;
import java.util.*;
class SadelPoint
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a rows: " );
		int n=sc.nextInt();
		
		System.out.println("Enter a columns: " );
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
		
		boolean found= false;
		
		for(int i=0;i<n;i++)
		{
			int min= arr[i][0];
			int col=0;
			
			for(int j=1;j<m;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
					col=j;
				}
			}
			
			boolean isSaddle = true;
			
			for(int k=0;k<n;k++)
			{
				if(arr[k][col]>min)
				{
					isSaddle = false;
					break;
				}
			}
			
			if(isSaddle)
			{
				System.out.println("Saddle point: "+min);
				found=true;
				break;
			}
		}
		
		if(!found)
		{
			System.out.println("Invalid input");
		}
	}
}