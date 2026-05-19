
public class BuySell2 {
    
    public static int maxprofit(int prices[],int n)
    
    {
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    
    
    public static void main (String args[]){
        
        int prices[]={7,1,5,3,6,4};
        int n=prices.length;
        System.out.println(n);
       int result= maxprofit(prices,n);
       System.out.println("Total Profit = "+result);
    }
}