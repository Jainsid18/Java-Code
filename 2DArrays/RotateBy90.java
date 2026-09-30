import java.lang.*;
import java.util.*;
class RotateBy90
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        System.out.println("Enter number of columns:");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
		
		   // Transpose
		 for(int i = 0; i < n; i++)
        {
            for(int j = i; j < m; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
		
		// Reverse every row
        for(int i = 0; i < n; i++)
        {
            int start = 0;
            int end = m - 1;

            while(start < end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }
		
		System.out.println("Matrix after 90 degree rotation:");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}

