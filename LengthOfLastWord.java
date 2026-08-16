public class LengthOfLastWord 
{
    public static void main(String args[])
    {
        String s="Hello World     ";
        String str=s.trim();
        int i=str.length()-1;
        int length=0;
        while(i>=0 && str.charAt(i)!=' ')
        {
            
                length++;
                i--;
        }System.out.print("count = "+length);
        
    }
}