package Package_04_User_input_Scanner;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Enter your name");
        Scanner nameScanner = new Scanner(System.in);
        String name = nameScanner.nextLine();

        System.out.println("Enter your age");
        Scanner ageScanner = new Scanner(System.in);
        int age = ageScanner.nextInt();

        System.out.println("Hello " + name + "! You are already " + age + " years old!");

    }
}
