import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		
		String strs[]={"dog","racecar","car"};
		
		Arrays.sort(strs);
		String str1=strs[0];
		String str2=strs[strs.length-1];
		
		int index=0;
		
		while(index<str1.length())
		{
		    if(str1.charAt(index)==str2.charAt(index))
		    {
		        index++;
		    }
		    else{
		        break;
		    }
		   
		}
		String result = index == 0 ? "their is no prefix in this array" : str1.substring(0, index);
        System.out.println(result);
	}
}