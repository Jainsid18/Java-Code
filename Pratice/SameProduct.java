import java.lang.*;
import java.util.*;
class SameProduct
{
	public static void main(String args[])
	{
		int arr[]={2,3,-2,4};
		
		int maxProduct = arr[0];
		int currMax= arr[0];
		int currMin = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			int x= arr[i];
			
			if(x<0)
			{
				int temp= currMax;
				currMax= currMin;
				currMin= temp;
			}
			
			currMax=Math.max(x,currMax*x);
			currMin= Math.min(x,currMin*x);
			
			maxProduct = Math.max(maxProduct,currMax);
		}
		
		System.out.println(maxProduct);
	}
}
		