import java.util.*;
public class WordBreak 
{
    public static boolean wordBreak(String s,List<String>wordDict)
    {
        Set<String>set=new HashSet<>(wordDict);
        int n=s.length();
        boolean dp[]=new boolean[n+1];
        
        dp[0]=true;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dp[j]&&set.contains(s.substring(j,i)))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
    public static void main(String args[])
    {
        String s="LeetCode";
        
        List<String>wordDict=Arrays.asList("Leet","Code");
        
        boolean ans=wordBreak(s,wordDict);
        System.out.println(ans);
    }
}