import java.lang.*;
import java.util.*;
class ShellRotate
{	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int n=sc.nextInt();
		
		System.out.println("Enter number of columns:");
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter shell number:");
		int s=sc.nextInt();
		
		System.out.println("Enter rotation:");
		int k=sc.nextInt();
		
	    int minRow = s-1;
		int minCol=s-1;
		int maxRow= n-s;
		int maxCol= m-s;
		
		//shell size
		int size = 2*(maxRow-minRow + maxCol -minCol);
		
		int oneD[]= new int[size];
		
		//2D ->1D
		int index=0;
		
		//Top-Bottom (Left Column)
		for(int i=minRow;i<=maxRow;i++)
		{
			oneD[index++]=arr[i][minCol];
		}
		
		//Left-Right (Bottom row)
		for(int j=minCol+1;j<=maxCol;j++)
		{
			oneD[index++]=arr[maxRow][j];
		}
		
		//Bottom-Top (Right column)
		for(int i=maxRow-1;i>=minRow;i--)
		{
			oneD[index++]=arr[i][maxCol];
		}
		
		//Top-row (Right-Left)
		for(int j=maxCol-1;j>minCol;j--)
		{
			oneD[index++]=arr[minRow][j];
		}
		
		//Rotate
		 k = k % size;
		 
		 if(k<0)
		 {
			 k = k+ size;
		 }
		 
		reverse(oneD, 0, k - 1);
        reverse(oneD, k, size - 1);
        reverse(oneD, 0, size - 1);
		
		 index = 0;
		 
		// Left column : Top -> Bottom
        for(int i = minRow; i <= maxRow; i++)
        {
            arr[i][minCol] = oneD[index++];
        }
		 // Bottom row : Left -> Right
        for(int j = minCol + 1; j <= maxCol; j++)
        {
            arr[maxRow][j] = oneD[index++];
        }

        // Right column : Bottom -> Top
        for(int i = maxRow - 1; i >= minRow; i--)
        {
            arr[i][maxCol] = oneD[index++];
        }

        // Top row : Right -> Left
        for(int j = maxCol - 1; j > minCol; j--)
        {
            arr[minRow][j] = oneD[index++];
        }
		
		   // Print matrix
        System.out.println("After Shell Rotation:");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

     // Reverse function
    static void reverse(int arr[], int left, int right)
    {
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
		}
	}
}