import java.lang.*;
import java.util.*;
class ValidPalindrome
{
	public static boolean isPalindrome(String s)
	{
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				sb.append((char)(ch+32));
			}
			else if(ch>='a' && ch<='z')
			{
				sb.append(ch);
			}
			else if(ch>='0' && ch<='9')
			{
				sb.append(ch);
			}
		}
		
		int left=0;
		int right= sb.length()-1;
		while(left<right)
		{
			if(sb.charAt(left) != sb.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
				
	
	public static void main(String args[])
	{
		String s = "A man, a plan, a canal: Panama";
		
		System.out.println(isPalindrome(s));
	}
}