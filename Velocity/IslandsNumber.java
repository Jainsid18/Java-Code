import java.lang.*;
import java.util.*;
class IslandsNumber
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter element in an array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int num=arr[0];
		int count=1;
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		for(int i=1;i<n;i++)
		{
			if(num+1==arr[i])
			{
				num=arr[i];
				list.add(arr[i]);
			}else
			{
				System.out.println(list);
				list=new ArrayList<>();
				num=arr[i];
				list.add(arr[i]);
				count++;
			}
		}
		
		System.out.println(list);
		System.out.println("Total islands: " + count);
	}
}
		
		