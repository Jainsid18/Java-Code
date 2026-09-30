import java.lang.*;
import java.util.*;
class ValidPalindrome
{
	public static boolean isPalindrome(String s)
	{	
		StringBuilder st= new StringBuilder();
		int left=0;
		int right =st.length()-1;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			   if(ch>='A' && ch<='Z')
			   {
				  st.append((char)(ch+32));
			   }
			   else if(ch>='a' && ch<='z')
			   {
				   st.append(ch);
			   }
		       else if(ch>='0' && ch<='9')
			   {
				   st.append(ch);
			   }
		}
		
		while(left<right)
		{
			if(st.charAt(left)!=st.charAt(right))
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
		String s= "A man , a pan; a canal : Panama";
	    System.out.println(isPalindrome(s));	
	}
}