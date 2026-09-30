public class RemoveElement {

    public static int removeElement(int nums[] , int val)
    {
        int left=0;

        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]!=val)
            {
                nums[left]= nums[right];
                left++;
            }
        }
        return left;
    }

    public static void main(String args[])
    {
        int nums[] = {3,2,2,3};
        int val=3;

        int k=removeElement(nums,val);

        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i] + " ");
        }

    }
}
