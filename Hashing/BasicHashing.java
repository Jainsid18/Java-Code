import java.lang.*;
import java.util.*;
class BasicHashing
{
	public static void main(String args[])
	{
		//Create
		HashMap<String,Integer> hm=new HashMap<>();
		
		//Insert 
		hm.put("India" , 100);
		hm.put("China" ,233);
		hm.put("US",50);
		
		System.out.println(hm);
		
		//Get -0(1)
		int population = hm.get("India");
		System.out.println(population);
		
		System.out.println(hm.get("Indonesia"));
		
		//ContainsKey - 0(1)
		System.out.println(hm.containsKey("India"));
		System.out.println(hm.containsKey("Indonesia"));
		
		//Iterate 
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for(String k : keys)
		{
			System.out.println("key=" + k + ",value=" + hm.get(k));
		}
	
		
	}
}