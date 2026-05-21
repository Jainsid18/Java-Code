import java.lang.*;
import java.util.*;
class BestTimeToBuy
{
	public  static int maxProfit(int prices[])
	{
		int costprice=Integer.MAX_VALUE;
		int maxProfit=0;
		
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]<costprice)
			{
				costprice=prices[i];
			}
			
			int sellprice=prices[i] - costprice;
			
			if(maxProfit<sellprice)
			{
				maxProfit=sellprice;
			}
		}
		return maxProfit;
	}
			
	
	public static void main(String args[])
	{
		int prices[]={7,1,5,3,6,4};
		System.out.print(maxProfit(prices));
	}
}