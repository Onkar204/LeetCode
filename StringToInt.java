//conversation of string to integer e.g "  -42" to 42

class StringToInt
{
	public static int myAtio(String s)
	{
		int i=0,sign=1;
		long result=0;
		
		while(i<s.length() && s.charAt(i)==' ')
		{
			i++;
		}
		if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+'))
		{
			if(s.charAt(i)=='-')sign= -1;
			i++;
		}
		while(i<s.length() && Character.isDigit(s.charAt(i))){
			
			int digit=s.charAt(i) - '0';
			result=result*10+digit;
			
			if(result*sign > Integer.MAX_VALUE)return Integer.MAX_VALUE;
			if(result*sign < Integer.MIN_VALUE)return Integer.MIN_VALUE;
			i++;
		}
		return(int)result*sign;
	}
	public static void main(String args[])
	{
		System.out.println(myAtio("42"));
		System.out.println(myAtio("   -42"));
		System.out.println(myAtio("4193 with words"));
		System.out.println(myAtio("words 987"));   
        System.out.println(myAtio("-91283472332"));
	}
}