import java.lang.*;
import java.util.*;
class SquareOfSortedArray1
{
	public static int[] sortedSquares(int nums[])
	{
		int n=nums.length;
		
		int ans[]= new int[n];
		
		int left=0;
		int right=n-1;
		
		int k = n-1;
		
		while(left<=right)
		{
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];
			
			if(leftSquare>rightSquare)
			{
				ans[k] = leftSquare;
				left++;
			}
			else{
				ans[k]=rightSquare;
				right--;
			}
			k--;
		}
		
		return ans;
	}
	
	 public static void main(String args[])
    {
        int nums[] = {-4,-1,0,3,10};
		
		 int result[] = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}