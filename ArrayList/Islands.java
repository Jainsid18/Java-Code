import java.lang.*;
import java.util.*;
class Islands
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int num= arr[0];
		int count=1;
		
		ArrayList<Integer> group = new ArrayList<>();
		group.add(arr[0]);
		
		for(int i=1;i<n;i++)
		{
			if(num+1==arr[i])
			{
				num=arr[i];
				group.add(arr[i]);
			}else{
				System.out.println(group);

                group = new ArrayList<>();
                group.add(arr[i]);
				
				num=arr[i];
				count++;
			}
		}	
		
	     System.out.println(group);
		System.out.println("Total Islands:" + count);
	}
}
		
		