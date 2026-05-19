import java.util.Scanner;

public class Hospital
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("******** Welcome to Hospital Expert System ********");
		System.out.println("Are you Sneezing ?(yes/no)");
		sneezes=sc.nextLine();
		
		System.out.println("Do you have high temperature?(yes/no)");
		temperature=sc.nextLine();
		
		System.out.println("Are you feeling weakness?(yes/no)");
		weakness=sc.nextLine();
		
		System.out.println("Do you have Cough? (yes/no)");
		cough=sc.nextLine();
		
		System.out.println("Do you forget things? (yes/no)");
		forget=sc.nextLine();
		
		System.out.println("Does your skin look pale ?(yes/no)");
		paleness=sc.nextLine();
		
		if(sneezes.equalsIgnoreCase("yes"))
		{
			System.out.println("Cold");
		}
		if(temperature.equalsIgnoreCase("yes"))
		{
			System.out.println("fever");
		}
		if(weakness.equalsIgnoreCase("yes"))
		{
			
		}
	}
}