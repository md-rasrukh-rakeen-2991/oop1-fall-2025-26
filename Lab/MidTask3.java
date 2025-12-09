import java.util.Scanner;
import java.util.InputMismatchException;

public class MidTask3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Mortgage Eligibility Calculator ---");

        double salary = getInput(
            "Enter your Salary (number only): ", 
            "Salary", 
            Double.class, 
            0, 
            Double.MAX_VALUE
        );
        
        int creditScore = getInput(
            "Enter your Credit Score (range 0 - 500): ", 
            "Credit Score", 
            Integer.class, 
            0, 
            500
        );

        boolean hasCriminalRecord = getCriminalRecordInput(
            "Enter your Criminal Record (True or False): "
        );

        boolean isEligible = checkLoanEligibility(creditScore, hasCriminalRecord);
    
        if (isEligible) {
            System.out.println("\n*** CONGRATULATIONS! You meet the basic Loan Eligibility requirements. ***");

            double maxLoan = salary * 2;
            double principalLoan = getInput(
                "Enter Principal Loan Amount: ",
                "Principal Loan Amount",
                Double.class,
                0,
                maxLoan - 0.01
            );
            
            System.out.println("\nLoan Eligibility Details:");
            System.out.printf("- Salary: $%.2f%n", salary);
            System.out.printf("- Credit Score: %d%n", creditScore);
            System.out.printf("- Criminal Record: %s%n", hasCriminalRecord ? "True" : "False");
            System.out.println("\nMortgage Calculation Inputs:");
            System.out.printf("- Requested Principal Loan: $%.2f%n", principalLoan);
            System.out.printf("- Max Allowed Loan (under 2x Salary): $%.2f%n", maxLoan);
            
            System.out.println("\n--- Calculating Mortgage... (Calculation logic not fully provided in requirements) ---");
            
        } else {
            System.out.println("\n*** SORRY. You **do not** meet the Loan Eligibility requirements and cannot calculate a mortgage at this time. ***");
        }

        scanner.close();
    }

    private static <T extends Number> T getInput(String prompt, String fieldName, Class<T> type, double min, double max) {
        while (true) {
            System.out.print(prompt);
            try {
                if (type == Integer.class) {
                    if (scanner.hasNextInt()) {
                        int value = scanner.nextInt();
                        if (value >= min && value <= max) {
                            return type.cast(value);
                        } else {
                            System.out.printf("Reminder: %s must be between %.0f and %.0f (inclusive).%n", fieldName, min, max);
                        }
                    } else {
                        // Rule 1: Not a number input
                        System.out.println("Reminder: User must input a number only as input.");
                        scanner.next();
                    }
                } else if (type == Double.class) {
                    if (scanner.hasNextDouble()) {
                        double value = scanner.nextDouble();
                        if (value > min && value <= max) {
                             return type.cast(value);
                        } else if (fieldName.contains("Principal") && value >= max) {
                             System.out.printf("Reminder: Principal Loan amount must be **UNDER** 2 times the salary (Max: $%.2f).%n", max);
                        } else {
                             System.out.printf("Reminder: %s must be greater than %.0f.%n", fieldName, min);
                        }
                    } else {
                        System.out.println("Reminder: User must input a number only as input.");
                        scanner.next();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Reminder: User must input a number only as input.");
                scanner.next();
            }
        }
    }
    
    private static boolean getCriminalRecordInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();
            } else {
                System.out.println("Reminder: Criminal Record must be 'True' or 'False'.");
                scanner.next(); // Consume the invalid input
            }
        }
    }

    private static boolean checkLoanEligibility(int creditScore, boolean hasCriminalRecord) {

        boolean goodCredit = creditScore >= 300; 
        
        boolean cleanRecord = !hasCriminalRecord; 

        return goodCredit && cleanRecord;
    }
}