public class IndexOfFirstOccurrenceInString 
{
    public static void main(String args[])
    {
        String hystack="sadbutsad";
        String needle="saad";
        
        for(int i=0;i<hystack.length()-needle.length()+1;i++)
        {
            if(hystack.charAt(i)==needle.charAt(0))
            {
                if(hystack.substring(i,needle.length()+i).equals(needle))
                {
                    System.out.println(i);
                    break;
                }
            }
            //
        }
        System.out.println("-1");
    }
}