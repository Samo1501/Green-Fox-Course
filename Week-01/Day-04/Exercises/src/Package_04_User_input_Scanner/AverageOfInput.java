package Package_04_User_input_Scanner;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

    // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        System.out.println("Enter 5 integers please:");

        Scanner newScanner1 = new Scanner(System.in);
        int int1 = newScanner1.nextInt();
        System.out.println(int1);

        int int2 = newScanner1.nextInt();
        System.out.println(int2);

        int int3 = newScanner1.nextInt();
        System.out.println(int3);

        int int4 = newScanner1.nextInt();
        System.out.println(int4);

        int int5 = newScanner1.nextInt();
        System.out.println(int5);

        int sum = int1 + int2 + int3 + int4 + int5;

        System.out.println("Sum: " + sum + ", Average: " + (sum/5.));



    }
}
