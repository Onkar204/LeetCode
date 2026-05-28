public class Majority_Element_Brute_Solution 
{
    public static void main(String args[])
    {
        int nums[]={3,2,3};
        
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>(n/2))
            {
                System.out.println(nums[i]);
                break;
            }
        }
        
    }
}