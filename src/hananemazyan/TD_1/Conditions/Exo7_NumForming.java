package hananemazyan.TD_1.Conditions;

import java.util.Scanner;

public class Exo7_NumForming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a  number of three-digit : ");
        int n = scanner.nextInt();

        if (n >= 100 && n <= 999) {
            int digit1 = n / 100; // the hundreds
            int digit2 = (n / 10) % 10; //the tens
            int digit3 = n % 10; // the units

            System.out.println("The original number is: " + n);

            System.out.print("Numbers formed by the digits of " + n + " are: ");

            System.out.print(digit1 * 100 + digit2 * 10 + digit3 + ", ");
            System.out.print(digit1 * 100 + digit3 * 10 + digit2 + ", ");
            System.out.print(digit2 * 100 + digit1 * 10 + digit3 + ", ");
            System.out.print(digit2 * 100 + digit3 * 10 + digit1 + ", ");
            System.out.print(digit3 * 100 + digit1 * 10 + digit2 + ", ");
            System.out.println(digit3 * 100 + digit2 * 10 + digit1);
        } else {
            System.out.println("Please enter a valid three-digit integer.");
        }
    }
}