import java.util.*;
public class Max_Product_Subarray 
{
    public static int max_product_subarray(int nums[])
    {
        int minProd=nums[0];
        int maxProd=nums[0];
        int result=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            int n=nums[i];
            
            if(n<0)
            {
                int temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            
             maxProd=Math.max(n,maxProd*n);
             minProd=Math.min(n,minProd*n);
            
            result=Math.max(result,maxProd);
        }
        return result;
    }
    
    
    public static void main(String args[])
    {
        int nums[]={-2,0,-1};
        
       int answer= max_product_subarray(nums);
       System.out.print(answer);
    }
}