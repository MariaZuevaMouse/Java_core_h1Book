package java_core.syntax3;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = in.nextLine();

        System.out.print("How are old are you? ");
        int age = in.nextInt();
        System.out.println("Hello " + name + ". Next year, you'll be " + (age+1));
    }
}
