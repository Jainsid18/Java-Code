import java.lang.*;
import java.util.*;
class SpiralMatrix
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
		
		int startRow=0;
		int startCol=0;
		int endRow=n-1;
		int endCol= m-1;
		
		while(startRow<=endRow && startCol <=endCol)
		{
			//Top to Bottom
			for(int i=startRow;i<=endRow;i++)
			{
				System.out.print(arr1[i][startCol]+ " ");
			}
			
			//Left to Right
			for(int j=startCol+1;j<=endCol;j++)
			{
				System.out.print(arr1[endRow][j]+ " ");
			}
			//Bottom to Top
			for(int i=endRow-1;i>=startRow;i--)
			{
				System.out.print(arr1[i][endCol]+ " ");
			}
			//Right to Left
			for(int j=endCol-1;j>startCol;j--)
			{
				System.out.print(arr1[startRow][j]+ " ");
			}
			
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
	}
}