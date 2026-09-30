import java.lang.*;
import java.util.*;
class GetCommonElement
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
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<n;i++)
		{
			set.add(arr1[i]);
		}
		
		int count=0;
		for(int i=0;i<m;i++)
		{
			if(set.contains(arr2[i]))
			{
				count++;
				set.remove(arr2[i]);
			}
		}
		System.out.println("Intersecting : " + count);
	}
}
		
		
		