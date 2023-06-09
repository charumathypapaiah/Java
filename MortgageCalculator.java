import java.text.NumberFormat;
import java.util.Scanner;

// Mortgage Calculator
// Get inputs from User : Principal (P), Annual Interest Rate in percentage(retrieve r as monthly interest rate by multiplying annual percentage by months in a year), Tenure(n) and find Mortgage Value (M)
// Formula : M= P * ( r(1+r)n / (1+r)n -1)
public class Main {
    public static void main(String[] args) {
        System.out.println("Mortgage Calculator");

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        long principal = scanner.nextLong();

        System.out.print("Annual Interest Rate: ");
        float monthlyInterestRate = (scanner.nextFloat())/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period (in Years): ");
        int periodInMonths = scanner.nextInt() * MONTHS_IN_YEAR;

        double mortgageValue = principal * ( (monthlyInterestRate* Math.pow(1+monthlyInterestRate,periodInMonths)) / (Math.pow(1+monthlyInterestRate,periodInMonths) - 1));

        String mortgageValueFormatted = NumberFormat.getCurrencyInstance().format(mortgageValue);

        System.out.println("Mortgage Value: " + mortgageValueFormatted);

    }
    }
