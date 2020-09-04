package Package_04_User_input_Scanner;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("Enter number of chicken:");
        Scanner chickenScanner = new Scanner(System.in);
        int chickenCount = chickenScanner.nextInt();

        System.out.println("Enter number of pigs:");
        Scanner pigScanner = new Scanner(System.in);
        int pigCount = pigScanner.nextInt();

        System.out.println("All the animals have " + ((chickenCount*2)+(pigCount*4)) + " legs in total.");

    }
}
