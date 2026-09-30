import java.lang.*;
import java.util.*;
class ZigZag
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println("Enter an elemnet in an array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		if(n==0)
		{
			System.out.println("Maximum Sub-sequence Count:0");
			return;
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(arr[0]);
		
		int count=1;
		
		boolean greater=true;
		
		for(int i=1;i<n;i++)
		{
			int last= list.get(list.size()-1);
			
			if(list.size()==1)
			{
				if(arr[i]>last)
				{
					list.add(arr[i]);
					count++;
					greater=false;
				}
				else if(arr[i]<last)
				{
					list.add(arr[i]);
					count++;
					greater=true;
				}
			}
			
			else if(greater && arr[i]>last)
			{
				list.add(arr[i]);
				count++;
				greater= false;
			}
			else if(!greater && arr[i] < last)
			{
				list.add(arr[i]);
				count++;
				greater=true;
			}
		}
		
		System.out.println("Maximum Sub-sequence Count : " + count);
		
		System.out.println("Sub Sequence:");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i) + " ");
		}
	}
}
		