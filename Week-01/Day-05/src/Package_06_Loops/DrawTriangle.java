package Package_06_Loops;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        System.out.println("Enter a number:");
        Scanner numScan = new Scanner(System.in);
        int num = numScan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            };
            System.out.println();
        }

















    }
}
