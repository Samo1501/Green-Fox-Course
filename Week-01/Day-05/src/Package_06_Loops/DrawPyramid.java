package Package_06_Loops;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

//we need one loop for spaces and other one for the stars
// write down number of iterations, check how many stars we need in each iteration and how much spaces and find connection


        Scanner numScan = new Scanner(System.in);
        int num = numScan.nextInt();

        String star = "*";
        String space = " ";
/*
        for (int i = 0; i <= num ; i++) {
            System.out.println(space.repeat(num - 1 - i) + star);
            star = star + "**";
        }
*/
//refactor i and rename it to "numberOfLines" and it renames all "i"s to "numberOfLines"
        //j = pyramidHeight
        for (int i = 0; i < num; i++) {
            for (int j = num; j < ; j++) {

            }
            System.out.println("x");

        }












    }
}
