package Package_04_User_input_Scanner;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        System.out.println("Type in a double number in miles here:");

        Scanner inputMilesScanner = new Scanner(System.in);
        double milesCount = inputMilesScanner.nextDouble();

        System.out.println(milesCount + "miles = " + (milesCount * 1.6) + " km");
    }
}
