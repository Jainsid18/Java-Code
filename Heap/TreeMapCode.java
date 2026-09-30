import java.lang.*;
import java.util.*;
class TreeMapCode
{
	public static void main(String args[])
	{
		TreeMap<String,Integer>lhm = new TreeMap<>();
		
		lhm.put("India",3000);
		lhm.put("China",4000);
		lhm.put("US",2000);
		
		System.out.println(lhm);
	}
}