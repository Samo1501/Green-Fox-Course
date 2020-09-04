package Package_05_Conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner numScanner = new Scanner(System.in);
        int number = numScanner.nextInt();

            if(number % 2 == 0) {
                System.out.println("even");
            } else {
                    System.out.println("odd");
            }







        }
    }
