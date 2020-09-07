package Package_06_Loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        System.out.println("Please, type down your first number:");
        Scanner numScanner = new Scanner(System.in);
        int num1 = numScanner.nextInt();

        System.out.println("Please, type down your second number:");
        int num2 = numScanner.nextInt();

        if (num2 <= num1) {
            System.out.println("The 2nd number should be bigger!");
        } else if (num2 > num1) {
            for (int i = num1; i < num2; i++) {
                System.out.println(i);

            }
        }










    }
}
