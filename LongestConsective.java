import java.util.*;
public class LongestConsective {
    
    public static int longestCongestive(int nums[],int n)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        
        int longest=0;
 
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int length=1;
                int current=num;
                while(set.contains(current+1))
                {
                    current++;
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
    
    public static void main(String args[])
    {
        int nums[]={100,4,200,1,2,3};
        int n=nums.length;
        
        int length=longestCongestive(nums,n);
        System.out.println(length);
    }
}