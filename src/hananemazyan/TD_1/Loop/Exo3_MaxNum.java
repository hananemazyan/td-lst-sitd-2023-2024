package hananemazyan.TD_1.Loop;

import java.util.Scanner;

public class Exo3_MaxNum {
    public static void main(String[] args) {
    int max = Integer.MIN_VALUE, n, p = 0, j = 1;
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("Enter a number (enter 0 to stop):");
        n = scanner.nextInt();

        if (n > max) {
            max = n;
            p = j;
        }
        j++;
    } while (n != 0);

    System.out.println("Max = " + max + " P = " + p);
}
}
