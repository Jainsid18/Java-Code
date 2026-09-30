import java.lang.*;
import java.util.*;
class LinkedHashMapCode
{
	public static void main(String args[])
	{
		LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();
		
		lhm.put("India",3000);
		lhm.put("China",4000);
		lhm.put("US",2000);
		
		System.out.println(lhm);
	}
}