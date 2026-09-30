import java.lang.*;
import java.util.*;
class FrequentlyOccure
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a size of Array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter element in an  Array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	
	    HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int j=0;j<n;j++)
        {	
			map.put(arr[j],map.getOrDefault(arr[j],0)+1);
		}
		
		System.out.println("Frequency Map : " + map);
	   
	   PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
	   
	   for(Integer key : map.keySet())
	   {
		   pq.add(key);
	   }
	   System.out.println("Enter n which u want:");
	   
	   int larg= sc.nextInt();
	   
	   for(int i=0;i<larg && !pq.isEmpty();i++)
	   {
		   int element = pq.remove();
	      System.out.println(/*element + "->" +*/ map.get(element));
	   }

	}
}

				
		   
				