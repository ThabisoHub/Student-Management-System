
import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
     Scanner scanner = new Scanner(System.in);

    public String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public int getIntInput(String prompt) {
        while (true) { 
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter an integer.");
            }
        }
    }

    public double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
            }
        }
    }

    public ArrayList<Double> getGradesInput() {
        ArrayList<Double> grades = new ArrayList<>();
        while (true) { 
            double grade = getDoubleInput("Enter grade (1- to stop): ");
            if (grade == -1) break;
            grades.add(grade);
        }
        return grades;
        
    }
}
