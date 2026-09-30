import java.lang.*;
import java.util.*;
class ExitPointOfMatrix
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
		
		
		int i=0;
		int j=0;
		int dir=0;
		
		while(true)
		{
			dir = (dir + arr1[i][j])%4;
			
			if(dir==0)
			{
				j++;
			}else if(dir==1)
			{
				i++;
			}else if(dir ==2)
			{
				j--;
			}else if(dir==3){
				i--;
			}
			
	       if(i<0 || i>=n || j<0 || j>=m)
		   {
			   break;
		   }
		}
			   
		if(i < 0)
        {
            i++;
        }
        else if(i >= n)
        {
            i--;
        }
        else if(j < 0)
        {
            j++;
        }
        else if(j >= m)
        {
            j--;
        }

        System.out.println("Exit Point: (" + i + ", " + j + ")");
    }
}	
		