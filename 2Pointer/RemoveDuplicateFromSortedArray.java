public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicate(int nums[])
    {
        if(nums.length==0)
        {
            return 0;
        }

        int left =0;
        for(int right =1 ; right<nums.length;right++)
        {
            if(nums[right]!=nums[left])
            {
                left++;
                nums[left]=nums[right];
            }
        }
        return left+1;
    }

    public static void main(String args[])
    {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int k=removeDuplicate(nums);

        for(int i = 0; i < k; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
}
