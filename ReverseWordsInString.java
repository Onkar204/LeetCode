public class ReverseWordsInString 
{
    public static String reverseWord(String s)
    {
        String words[]=s.trim().split("\\s+");
        String result="";
        for(int i=words.length-1;i>=0;i--)
        {
            result+=words[i];
            if(i!=0)
            {
                result+=" ";
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        String s="the sky is blue";
        
        String result=reverseWord(s);
        System.out.print(result);
    }
}


