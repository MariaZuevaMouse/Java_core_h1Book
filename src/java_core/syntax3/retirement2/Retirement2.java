package java_core.syntax3.retirement2;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance =0;
        int year = 0;

        String input;

        do{
            balance+= payment;
            double interest = balance*interestRate/100;
            balance+= interest;

            year++;

            System.out.printf("After year %d, you balance is %,.2f%n", year,balance);

            System.out.println("ready to retire? Y/N");
            input = in.next();

        } while(input.equals("N"));
    }
}
