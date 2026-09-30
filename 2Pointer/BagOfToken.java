import java.lang.*;
import java.util.*;
class BagOfToken
{
	public static int bagOfToken(int tokens[],int power)
	{
		Arrays.sort(tokens);
		
		int left=0;
		int right=tokens.length -1;
		
		int score=0;
		int maxScore=0;
		
		while(left<=right)
		{
			if(power>=tokens[left])
			{
				power=power-tokens[left];
				score++;
				left++;
				
				maxScore=Math.max(maxScore,score);
			}
			else if(score>0)
			{
				power = power+ tokens[right];
				score--;
				right--;
			}
			else{
				break;
			}
		}
		return maxScore;
	}
	
	public static void main(String args[])
	{
		int tokens[]={100,200,300,400};
		int power =200;
		System.out.println(bagOfToken(tokens,power));
	}
}
