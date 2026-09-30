import java.lang.*;
import java.util.*;
class HighestFrequency
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String: ");
		
		String str = sc.nextLine();
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch , hm.getOrDefault(ch,0)+1);
			}else{
				hm.put(ch,1);
			}
		}
		
		Set<Character> keys= hm.keySet();
		
		char mfc = str.charAt(0);
		
		for(Character k : keys)
		{
			if(hm.get(k) > hm.get(mfc))
			{
				mfc= k;
			}
		}
		
		System.out.println(mfc);
			
	}
}
		