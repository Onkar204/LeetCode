public class ZigZagConversion 
{
    public static String zigZag(String s,int numsRows)
    {
        if(numsRows==1 || numsRows>s.length())
        {
            return s;
        }
        
        StringBuilder ans[]=new StringBuilder[numsRows];
        
        for(int i=0;i<numsRows;i++)
        {
            ans[i]=new StringBuilder();
        }
        
        boolean flag=false;
        int i=0;
        for(char ch:s.toCharArray())
        {
            ans[i].append(ch);
            
            if(i==0 || i==numsRows-1)
            {
                flag=!flag;
            }
            if(flag)
            {
                i=i+1;
            }
            else{
                i=i-1;
            }
        }
        StringBuilder zigzag=new StringBuilder();
        
        for(StringBuilder str:ans)
        {
            zigzag.append(str);
        }
        return zigzag.toString();
    }
    public static void main(String args[])
    {
        String s="PAYPALISHIRING";
        int numsRows=3;
        
        String result=zigZag(s,numsRows);
        System.out.print(result);
        
        
    }
}