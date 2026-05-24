public class Minimum_in_Rotated_Sorted_Array_II
{
    public static void main(String args[])
    {
        int nums[]={2,2,2,0,1};
        
        int small=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<small)
            {
                small=nums[i];
            }
        }
        System.out.println(small);
    }
}