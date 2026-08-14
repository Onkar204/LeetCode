public class PalindromeNumber
{
	public static void main(String args[])
	{
		int num=121;
		int rem=0,sum=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==num)
		{
			System.out.print("palindrome");
			
		}else
		{
			System.out.print("not palindrome");
		}
	}
}