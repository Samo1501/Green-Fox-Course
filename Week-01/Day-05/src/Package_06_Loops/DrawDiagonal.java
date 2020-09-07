package Package_06_Loops;
//Unfinished exercise !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

        System.out.println("Enter a number: ");
        Scanner numScan = new Scanner(System.in);
        int num = numScan.nextInt();
        String block = "%";
        String space = " ";

        for (int i = 0; i < num; i++) {
                System.out.println(space.repeat(num - i) + block);
            }

        
        
        
        
        
        
        
    }
}
