public class Rotate_Right_K_Place 
{
    public static void main(String args[])
    {
        int nums[]={1,2,3,4,5,6,7};
        int n=nums.length;
        int k=3;
        int temp[]={5,6,7};
        int j=0;
        for(int i=n-k-1;i>=0;i--)
        {
          nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++)
        {
            nums[i]=temp[j];
            j++;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}