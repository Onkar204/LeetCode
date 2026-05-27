public class Maximum_Gap 
{
    public static void main(String args[])
    {
        int nums[]={3,6,9,1};
        
        int maxGap=0;
        
        for(int i=1;i<nums.length;i++)
        {
            int diff=nums[i]-nums[i-1];
            
          if(diff>maxGap)
          {
              maxGap=diff;
          }
           
        }
        System.out.print(maxGap);
    }
}