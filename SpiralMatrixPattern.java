import java.lang.*;
import java.util.*;
class SpiralMatrixPattern
{
	public static void main(String args[])
	{
		int n=4;
		
		int top=0;
		int bottom= n-1;
		int left=0;
		int right= n-1;
		
		int arr[][]=new int[n][n];
		
		int num=1;
		
		
		while(num<=n*n)
		{
			//left -> right
			for(int i=left;i<=right;i++)
			{
				arr[top][i]=num++;
			}
			top++;
			
			//top ->bottom
			for(int i=top;i<=bottom;i++)
			{
				arr[i][right]=num++;
			}
			right--;
			
			//right ->left
			for(int i=right;i>=left;i--)
			{
				arr[bottom][i]=num++;
			}
			bottom--;
			
			//bottom -> top
			for(int i=bottom;i>=top;i--)
			{
				arr[i][left]=num++;
			}
			left++;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
			
			