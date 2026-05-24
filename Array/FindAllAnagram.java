import java.lang.*;
import java.util.*;
class FindAllAnagram
{
	public static List<Integer> findAnagram(String s,String p)
	{
		List<Integer>ans = new ArrayList<>();
		
		char pArray[]=p.toCharArray();
		
		Arrays.sort(pArray);
		
		String sortedp = new String(pArray);
		
		int k=p.length();
		
		for(int i=0;i<=s.length()-k;i++)
		{
			String sub = s.substring(i,i+k);
			
			char temp[] =sub.toCharArray();
			
			Arrays.sort(temp);
			
			String sortedSub = new String(temp);
			
			if(sortedp.equals(sortedSub))
			{
				ans.add(i);
			}
		}
		return ans;
	}
		
	
	public static void main(String args[])
	{
		String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagram(s, p));
    }
}