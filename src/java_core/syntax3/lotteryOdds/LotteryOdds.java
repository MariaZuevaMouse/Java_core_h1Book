package java_core.syntax3.lotteryOdds;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.print("What is the highest number yoy can draw?");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for(int i=1; i<=k; i++)
            lotteryOdds = lotteryOdds*(n-i+1)/i;

        System.out.println("You odda are 1 in " + lotteryOdds + ". Good luck!!!");
    }
}
