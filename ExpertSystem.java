import java.util.*;
import java.io.*;

public class ExpertSystem {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> knowledge = new HashMap<>();

        // Reading CSV File
        try {
            BufferedReader br = new BufferedReader(new FileReader("disease.csv"));

            String line;

            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");

                knowledge.put(data[0], data[1]);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading CSV file");
            return;
        }

        // Questions
        HashMap<String, String> questions = new HashMap<>();

        questions.put("sneezes", "Are you sneezing frequently?");
        questions.put("temperature", "Do you have high temperature?");
        questions.put("weakness", "Are you feeling weakness?");
        questions.put("forgets", "Do you forget things?");
        questions.put("cough", "Do you have cough?");
        questions.put("paleness", "Does your skin look pale?");

        System.out.println("***** Welcome to Hospital Expert System *****");

        ArrayList<String> diagnosis = new ArrayList<>();

        // Asking Questions
        for (String symptom : questions.keySet()) {

            System.out.print(questions.get(symptom) + " (yes/no): ");

            String answer = sc.nextLine().toLowerCase();

            if (answer.equals("yes")) {

                diagnosis.add(knowledge.get(symptom));
            }
        }

        // Output
        System.out.println("\nPossible Diseases:");

        if (diagnosis.size() == 0) {

            System.out.println("No disease detected.");

        } else {

            for (String d : diagnosis) {
                System.out.println(d);
            }
        }

        sc.close();
    }
}