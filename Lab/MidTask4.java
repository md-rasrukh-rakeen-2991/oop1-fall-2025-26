import java.util.Scanner;
import java.lang.Math;
import java.util.FizzBuzz;

public class MidTask4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the principal loan amount: ");
        double principalLoan = scanner.nextDouble();
    
        double annualInterestRate = scanner.nextDouble();
        
        int loanPeriodYears = scanner.nextInt();
        System.out.println("Enter the loan period (in years):" + loanPeriodYears);

        //calculate monthly interest rate

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // calculate  total number of payments

        int totalNumberOfPayments = loanPeriodYears * 12;

        // use the mortgage payment formula

        double totalMortgagePayment = principalLoan * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalNumberOfPayments)) / (Math.pow(1 + monthlyInterestRate, totalNumberOfPayments) - 1);

        System.out.println("Total Mortgage Payment:" + totalMortgagePayment);

        scanner.close();

    }
}

    
