//GFG 2 :Calculate Average of an array 
class AverageArray
{
	public static void main(String []args)
	{
		float sum=0;
		float []a={1,2,10,4,5};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			sum=sum + a[i];
		}
		float avg=sum/n;
		System.out.println("Average Number of array :"+avg);
	}

}