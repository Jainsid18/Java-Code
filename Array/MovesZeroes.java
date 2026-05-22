import java.lang.*;
import java.util.*;
class MovesZeroes
{
	public static void moveZeroes(int nums[])
	{
		int ans[] = new int[nums.length];
		int j=0;
		
		for(int i=0;i<nums.length;i++)
		{
		   if(nums[i]!=0){
			   ans[j]=nums[i];
			   j++;
		   }
		}
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+ " ");
		}
	}
		
	
	public static void main(String args[])
	{
		int nums[]={0,1,0,3,12};
		
		moveZeroes(nums);
	}
}