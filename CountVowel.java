/*Program to count vowels in a string (Iterative and Recursive)
Input : abc de
Output : 2*/
import java.util.*;
public class CountVowel
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		//int count=0;
		String str;
		HashSet<Character> vowels = new HashSet<>();
		System.out.println("Enter your String :");
		str=sc.next();
		
		//abc
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			{
				vowels.add(ch);
			}
		}
		System.out.println("Number of vowels in given sencentence is "+vowels.size());
	}
}