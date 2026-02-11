import java.util.*;
public class CheckDuplicateInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Array Elements are....\n");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("duplicate number not found !!!1");
		}
		else
		{
			System.out.println("Duplicate number found !!!");
		}  with O(n^2)*/ 
		
		HashSet<Integer>set=new HashSet<>();
		boolean DuplicateFound=false;
		for(int num:arr)
		{
			if(!set.add(num))
			{
				DuplicateFound=true;
				break;
				
			}
		}
		if(DuplicateFound)
		{
			System.out.println("Duplicate found !!!");
			
		}
		else{
			System.out.println("Duplicate not found!!!!");
		}//with O(n) which is better
	}
}