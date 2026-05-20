import java.lang.*;
import java.util.*;
class AdvanceRect
{
	public static void advance_rect(int totrows,int totcol)
	{
		for(int i=0;i<totrows;i++)
		{
			for(int j=0;j<totcol;j++)
			{
				int top=i;
				int left=j;
				int bottom= totrows-1-i;
				int right= totcol -1-j;
				
				int layer = Math.min(Math.min(top,bottom),Math.min(left,right));
				
				int value=4-layer;
				System.out.print(value);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int a=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int b=sc.nextInt();
		
		
		advance_rect(a,b);
	}
}