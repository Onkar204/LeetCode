public class ReverseOnlyVowel 
{
    
    public static String reverseVowel(String s)
    {
        int left=0;
        int right=s.length()-1;
        
        char ch[]=s.toCharArray();
        while(left<right)
        {
             while(left<right && !isVowel(ch[left]))
            {
                left++;
            }
            while(left<right && !isVowel(ch[right]))
            {
                right--;
            }
            
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            
            left++;
            right--;
                
        }
        return new String(ch);
    }
    public static boolean isVowel(char ch)
    {
        return ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public static void main(String args[])
    {
        String s="IceCreAm";
        
        String result=reverseVowel(s);
       System.out.print(result);
        
    }
}