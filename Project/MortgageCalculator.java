import java.util.Scanner;
import java.math.Math;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double principalLoan = scanner.nextDouble();
        System.out.println("Enter the principal loan amount:" + principalLoan);
    
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Enter the annual interest rate (in % ):" + annualInterestRate);
        
        int loanPeriodYears = scanner.nextInt();
        System.out.println("Enter the loan period (in years):" + loanPeriodYears);

        //calculate monthly interest rate

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // calculate  total number of payments

        int totalNumberOfPayments = loanPeriodYears * 12;

        // use the mortgage payment formula

        double totalMortgagePayment = principalLoan * ( ( monthlyInterestRate * Math.pow( 1 + monthlyInterestRate), totalNumberOfPayments ) / ( Math.pow( 1 + monthlyInterestRate) - 1 ) );

        System.out.println("Total Mortgage Payment:" + totalMortgagePayment);

    }
    
