import java.lang.*;
import java.util.*;
class SortedMatrix
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
		
		System.out.println("Enter key which u want to search :");
		int key=sc.nextInt();
		
		stairCaseSearch(arr, key);
	}
	
	public static boolean stairCaseSearch(int arr[][],int key)
	{
		int row=0;
		int column= arr[0].length-1;
		
		while(row<arr.length && column >=0)
		{
			if(arr[row][column]==key)
			{
				System.out.println("Key is found at (" + row + "," + column+")");
				return true;
			}
			else if(key<arr[row][column])
			{
				column--;
			}else{
				row++;
			}
		}
		System.out.println("Key is not found");
		return false;
	}
		
}
