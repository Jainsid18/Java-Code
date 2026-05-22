import java.lang.*;
import java.util.*;
class MergeSortedArrays
{
	public static void merge(int nums1[],int m,int nums2[],int n)
	{
		int temp[]=new int[m+n];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<m && j<n)
		{
			if(nums1[i]<=nums2[j])
			{
				temp[k]=nums1[i];
				i++;
			}else{
				temp[k]=nums2[j];
				j++;
			}
			k++;
		}
		
		while(i<m)
		{
			temp[k]=nums1[i];
			i++;
			k++;
		}
		
		while(j<n){
			temp[k]=nums2[j];
			j++;
			k++;
		}
		
		for(int x=0;x<m+n;x++)
		{
			nums1[x]=temp[x];
		}
	}
	public static void main(String args[])
	{
		int nums1[]={1,2,3,0,0,0};
		int m=3;
		
		int nums2[]={2,5,6};
		int n=3;
		merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(nums1));
	}
}