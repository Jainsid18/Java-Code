import java.lang.*;
import java.util.*;
class TwoSum
{
	public static int[] twoSum(int numbers[],int target)
	{
	   int ans[]= new int[2];
		 
	   for(int i=0;i<numbers.length;i++)
	   {
		   for(int j=i+1;j<numbers.length;i++)
		   {
			   if(numbers[i] + numbers[j] ==target)
			   {
				   ans[0]=i;
				   ans[1]=j;
				   return ans;
			   }
		   }
	   }
	   
	   return ans;
		
	}
	
	public static void main(String args[])
	{
		int numbers[]={2,7,11,15};
		int target=9;
		int result[] =twoSum(numbers,target);
		System.out.println(Arrays.toString(result));
	}
}