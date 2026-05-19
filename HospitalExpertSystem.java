import java.util.Scanner;

public class HospitalExpertSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("******** Welcome to Hospital Expert System ********");

        System.out.print("Are you sneezing frequently? (yes/no): ");
        String sneezes = sc.nextLine();

        System.out.print("Do you have high temperature? (yes/no): ");
        String temperature = sc.nextLine();

        System.out.print("Are you feeling weakness in body? (yes/no): ");
        String weakness = sc.nextLine();

        System.out.print("Do you forget things frequently? (yes/no): ");
        String forgets = sc.nextLine();

        System.out.print("Do you have cough or sore throat? (yes/no): ");
        String cough = sc.nextLine();

        System.out.print("Does your skin look pale? (yes/no): ");
        String paleness = sc.nextLine();

        System.out.println("\nPossible Diagnosis:");

        if(sneezes.equalsIgnoreCase("yes"))
        {
            System.out.println("Cold");
        }

        if(temperature.equalsIgnoreCase("yes"))
        {
            System.out.println("Fever");
        }

        if(weakness.equalsIgnoreCase("yes"))
        {
            System.out.println("Iron Deficiency");
        }

        if(forgets.equalsIgnoreCase("yes"))
        {
            System.out.println("Alzheimer's");
        }

        if(cough.equalsIgnoreCase("yes"))
        {
            System.out.println("Covid-19");
        }

        if(paleness.equalsIgnoreCase("yes"))
        {
            System.out.println("Flu");
        }

        sc.close();
    }
}