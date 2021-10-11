

import java.util.Scanner;

public class MoneyBank {

    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of months: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();

//        totalInterestRate(money, month, interestRate);
        System.out.println("Total Interest Rate: " + totalInterestRate(money, month, interestRate));

    }

    public static double totalInterestRate(double money, int month, double interestRate) {
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        return totalInterest;
    }
}



