public class PlusOne{
    public static int[] plusone(int []num)
    {
        for(int i=num.length-1;i>=0;i--)
        {
            if(num[i]<9)
            {
                num[i]++;
                return num;
            }
            num[i]=0;
        }
        int newarr[]=new int[num.length+1];
        newarr[0]=1;
        return newarr;
    }
    
    public static void main(String args[])
    {
        int num[]={9,9,9};
        
        int result[]=plusone(num);
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]);
        }
    
    }
}