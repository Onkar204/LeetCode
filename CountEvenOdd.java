// GFG 1 : Count Number of even and odd in given array 

class CountEvenOdd
{
   public static void main(String []args)
   {
	   int countEven=0,countOdd=0;
	   int []a={4,3,2,1,9};
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]%2==0)
		   {
			   countEven++;
		   }else{
			   countOdd++;
		   }
	   }
	   System.out.println("Even count ="+countEven);
	   System.out.println("Odd count ="+countOdd);
   }
}