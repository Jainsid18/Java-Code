import java.lang.*;
import java.util.*;
class ContainerWithMostWater
{
	public static int maxAmount(int height[])
	{
		int maxArea=0;
		for(int i=0;i<height.length;i++)
		{
			for(int j=i+1;j<height.length;j++)
			{
				int area= Math.min(height[i],height[j]) * (j-i);
				maxArea=Math.max(maxArea,area);
			}
		}
		return maxArea;
	}
	
     public static void main(String args[])
	 {
        int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxAmount(height));
	 }
}	 
