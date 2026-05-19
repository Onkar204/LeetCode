import java.util.Arrays;
public class Main {
    
    public static int ThreeSumClosest (int num[],int target)
    {
        Arrays.sort(num);
        int closestsum=num[0]+num[1]+num[2];
        
        for(int i=0;i<num.length-2;i++)
        {
            int left=i+1;
            int right=num.length-1;
            while(left<right)
            {
                int sum=num[i]+num[left]+num[right];
                
                if(Math.abs(target-sum)<Math.abs(target-closestsum))
                {
                    closestsum=sum;
                }
                if(sum<target)
                {
                    left++;
                }else if(sum>target)
                {
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return closestsum;
    }
    public static void main(String args[])
    {
        int num[]={-1,2,1,-4};
        int target=1;
        System.out.println(ThreeSumClosest(num,target));
    }
}