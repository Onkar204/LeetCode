import java.util.*;
public class Candy 
{
    public static int candy(int rating[])
    {
        int n=rating.length;
        int candies[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            candies[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            if(rating[i]>rating[i-1])
            {
                candies[i]=candies[i-1]+1;
            }
        }
        
        for(int i=n-2;i>=0;i--)
        {
            if(rating[i] >rating[i+1])
            {
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        
        int total=0;
        for(int candy:candies)
        {
            total+=candy;
        }
        return total;
    }
    public static void main(String args[])
    {
        int rating[]={1,0,2};
        
        int total=candy(rating);
        System.out.println(total);
    }
}