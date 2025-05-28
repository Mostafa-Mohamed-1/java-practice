package katas;

import java.util.Scanner;

public class GCD {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        return first;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (>=10): ");
        int first = scanner.nextInt();

        System.out.print("Enter second number (>=10): ");
        int second = scanner.nextInt();

        int gcd = getGreatestCommonDivisor(first, second);

        if (gcd == -1) {
            System.out.println("Both numbers must be at least 10.");
        } else {
            System.out.println("GCD is: " + gcd);
        }

        scanner.close();
    }
}
