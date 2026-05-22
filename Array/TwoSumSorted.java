import java.lang.*;
import java.util.*;

class TwoSumSorted
{
    public static int[] twoSum(int numbers[], int target)
	{
		int n=numbers.length;
		int left = 0;
		int right = n-1;
		
		int ans[] = new int[2];
		
		while(left<right)
		{
			int sum = numbers[left] + numbers[right];
			
			if(sum==target)
			{
				ans[0]=left + 1;
				ans[1] = right +1;
				
				return ans;
			}
			else if(sum<target)
			{
				left++;
			}
			else{
				right --;
			}
		}
		return ans;
	}
		

	 public static void main(String args[])
    {
        int numbers[] = {2,7,11,15};

        int target = 9;
        
        int result[] = twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
	}
	
}