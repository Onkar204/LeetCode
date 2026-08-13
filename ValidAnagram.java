public class ValidAnagram 
{
    public static boolean validAnagram(String s,String t)
    {
         int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
            
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void  main(String args[])
    {
        String s="anagram";
        String t="nagaram";
        
        boolean ans=validAnagram(s,t);
        System.out.print(ans);
       
    }
}