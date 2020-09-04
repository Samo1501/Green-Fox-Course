package Package_05_Conditionals;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Enter your 1st number:");
        Scanner scanner01 = new Scanner(System.in);
        int number01 = scanner01.nextInt();
        System.out.println(number01);

        System.out.println("Enter your 2nd number:");
        int number02 = scanner01.nextInt();
        System.out.println(number02);

        if (number01 > number02) {
            System.out.println(number01 + " was bigger!");
        } else if (number01 < number02) {
            System.out.println(number02 + " was bigger!");
        } else {
            System.out.println("Both numbers are equal!");
        }











    }
}
