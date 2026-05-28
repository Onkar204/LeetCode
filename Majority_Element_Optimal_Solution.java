public class Majority_Element_Optimal_Solution 
{
    public static void main(String args[])
    {
        int nums[]={2,2,1,1,1,2,2};
        
        int candidate=nums[0];
        int count=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==candidate)
            {
                count++;
            }
            else{
                count--;
            }
            
            if(count==0)
            {
                candidate=nums[i];
                count=1;
            }
        }
        System.out.print(candidate);
    }
}