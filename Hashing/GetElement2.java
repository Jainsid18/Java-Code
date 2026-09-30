import java.lang.*;
import java.util.*;
class GetElement2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of an Array 1: ");
		int n=sc.nextInt();
		
		int arr1[]= new int[n];
		System.out.println("Enter element of Array 1: ");
		
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter Size of an Array 2: ");
		int m=sc.nextInt();
		
		int arr2[]= new int[m];
		System.out.println("Enter element of Array 2: ");
		
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int val : arr1)
		{
			if(hm.containsKey(val))
			{
				hm.put(val,hm.getOrDefault(val,0)+1);
			}else{
				hm.put(val,1);
			}
		}
		
		for(int val : arr2)
		{
			if(hm.containsKey(val) && hm.get(val)>0)
			{
				System.out.print(val + " ");
				hm.put(val,hm.getOrDefault(val,0)-1);
			}
		}
	}
}