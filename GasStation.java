public class GasStation 
{
    public static int gasStation(int gas[],int cost[])
    {
        int tank=0;
        int start=0;
        int total=0;
        
        for(int j=0;j<gas.length;j++)
        {
            int gain=gas[j]-cost[j];
            
            
            tank+=gain;
            total+=gain;
            
            if(tank<0)
            {
                start=j+1;
                tank=0;
            }
           
            
        }
         if(total<0)
            {
                return -1;
            }
        return start;
        
    }
    public static void main(String args[])
    {
        int gas[]= {2,3,4};
        int cost[]={3,4,3};
        
        
        int result=gasStation(gas,cost);
        System.out.println(result);
    }
}