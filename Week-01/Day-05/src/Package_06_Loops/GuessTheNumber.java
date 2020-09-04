package Package_06_Loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

        System.out.println("Guess a number:");
        Scanner numScan = new Scanner(System.in);
        int guessNum = numScan.nextInt();
        int actualNum = 55;


        if (guessNum == actualNum) {System.out.println("Congratulations, you found the number: " + actualNum);
        } else
            {while (guessNum != actualNum) {
                if (guessNum > actualNum) {
                    System.out.println("Less! Guess again!");
                    guessNum = numScan.nextInt();
                } else if (guessNum < actualNum) {
                    System.out.println("More! Guess again!");
                    guessNum = numScan.nextInt();
                }
            }
        }

        /*
       while (guessNum != actualNum) {
            if (guessNum > actualNum) {
                System.out.println("Less! Guess again!");
                guessNum = numScan.nextInt();
            } else if (guessNum < actualNum) {
                System.out.println("More! Guess again!");
                guessNum = numScan.nextInt();
            } else if (guessNum == actualNum) {
            System.out.println("Congratulations, you found the number: " + actualNum);}
        }
         */

         //   System.out.println("You found the number: " + actualnum);


    }
}
