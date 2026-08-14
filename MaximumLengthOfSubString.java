import java.util.*;
public class  MaximumLengthOfSubString
{
   public static int maximumLengthOfSubString(String s)
    {
        int freq[]=new int[26];
        int max_length=0;
        int left=0;

        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'a']++;

            while(freq[s.charAt(right)-'a']>2)
            {
                freq[s.charAt(left)-'a']--;
                left++;
            }
            int length=right-left+1;
            max_length=Math.max(max_length,length);
        }
        return max_length;
    }
    public static void main(String args[])
    {
        String s="bcbbbcba";
        int max_length=maximumLengthOfSubString(s);
        System.out.print("max_length"+max_length);
    }
}