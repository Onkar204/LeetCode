import java.util.*;
public class LargestNumber 
{
    public static void main(String args[])
    {
        int num[]={3,30,34,5,9};
        String arr[]=new String[num.length];
        
        for(int i=0;i<num.length;i++)
        {
            arr[i]=String.valueOf(num[i]);
        }
        
        Arrays.sort(arr,(a,b)-> (b+a).compareTo(a+b));
        
        if(arr[0].equals("0"))
        {
            System.out.println("0");
            
        }
        StringBuilder ans=new StringBuilder();
        for(String s:arr)
        {
            ans.append(s);
        }
        System.out.print(ans.toString());
    }
}