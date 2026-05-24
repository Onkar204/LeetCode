public class Minimum_in_Rotated_Sorted_Array 
{
    public static int Minimum_in_Rotated_Sorted_Array(int nums[])
    {
        int left=0;
        int right=nums.length-1;
        
        while(left<right)
        {
            int mid=left+(right-left)/2;
            
            if(nums[mid]>nums[right])
            {
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
    public static void main(String args[])
    {
        int nums[]={34,5,6,7,0,1,2};
        
        int result=Minimum_in_Rotated_Sorted_Array(nums);
        System.out.print(result);
    }
}