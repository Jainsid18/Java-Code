import java.lang.*;
import java.util.*;
class TwoSum1
{
	public static int[] twoSum(int numbers[],int target)
	{
		HashMap<Integer,Integer> map =new HashMap<>();
		int ans[] = new int[2];
		
		for(int i=0;i<numbers.length;i++)
		{
			int complement = target-numbers[i];
			
			if(map.containsKey(complement))
			{
				ans[0] = map.get(complement);
				ans[1] =i;
				return ans;
			}
			map.put(numbers[i],i);
		}
		
		return ans;
	}
	
	public static void main(String args[])
	{
		int numbers[] = {2,7,11,15};
        int target = 9;
		
		int ans[] = twoSum(numbers, target);
		System.out.println(Arrays.toString(ans));
	}
}