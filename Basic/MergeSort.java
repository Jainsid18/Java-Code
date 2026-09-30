import java.lang.*;
import java.util.*;
class MergeSort
{
	public static void merge(int arr[], int start,int mid,int end)
	{
		int temp[]= new int[end - start + 1];
		
		int i=start;
		int j=mid+1;
		int k=0;
		
		while(i<=mid && j<=end)
		{
		  if(arr[i]<=arr[j])
		  {
			  temp[k] =arr[i];
			  i++;
		  }else{
			  temp[k] = arr[j];
			  j++;
		  }
		  k++;
		}
		
		while(i<=mid)
		{
			temp[k]=arr[i];
			k++;
			i++;
		}
		
		while(j<=end)
		{
			temp[k]=arr[j];
			k++;
			j++;
		}
		
		for(int x=0;x<temp.length;x++)
		{
			arr[start+x]=temp[x];
		}
	}
		
	public static void mergeSort(int arr[] , int start , int end)
	{
		if(start>=end)
		{
			return;
		}
		int mid = start + (end-start)/2;
		
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
	}
	
	 public static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array 1: " );
		int n= sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter elemnet int Array1:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of Array 2: " );
		int m= sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("Enter elemnet int Array2:");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int resultArr[] = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			resultArr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			resultArr[arr1.length+i]=arr2[i];
		}
		
		
		mergeSort(resultArr, 0 ,resultArr.length-1);
		//mergeSort(arr2, 0 ,arr2.length-1);
		
		System.out.println("Sorted Array is :");
        printArray(resultArr);

       /* System.out.println("Sorted Array 2:");
        printArray(arr2);*/
		
	}
}

/*
Enter size of Array 1:
5
Enter elemnet int Array1:
1 3 5 7 9
Enter size of Array 2:
5
Enter elemnet int Array2:
2 4 6 8 10
Sorted Array is :
1 2 3 4 5 6 7 8 9 10

*/
		
		
		