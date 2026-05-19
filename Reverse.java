// reverse number for e.g input=-123 output=-321

public class Reverse
{
	public static void main(String[] args) {
		
		int num=-123843887,rev=0,rem=0;
		
		boolean isNegative=num<0;
		
		if(isNegative)
		{
		    num=-num;
		}
    		while(num>0)
    		{
    		    rem=num%10;
    		    rev=(rev*10+rem);
    		    num=num/10;
    		}
		if(isNegative)
		{
		    rev=-rev;
		}
		System.out.print(rev);
	}
}