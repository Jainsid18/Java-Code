import java.lang.*;
import java.util.*;
class SquareOfASortedArray
{
	public static int[] SquareArray(int nums[])
	{
		int n=nums.length;
		int arr[] = new int[n];
		
		for(int i=0;i<nums.length;i++)
		{
		   arr[i]=nums[i]*nums[i];
		}
		
		Arrays.sort(arr);
		return arr;
	}
	
    public static void main(String args[])
    {
       int nums[] = {-4,-1,0,3,10};
	   System.out.println(Arrays.toString(SquareArray(nums)));
    }

}