import java.util.Scanner;

public class Main {
    //type "psvm" to create "main"
    public static void main(String[] args) {
        System.out.println("Hello World!");
//This is a one-line comment.

/*This is multiline comment.
sdfsfsfsfsf
sffsaf
 */

        int IntegerNumber = 50244;
        short ShortNumber = 1;
        long LongNumber = 645050256;
        byte ByteNumber = 0;

        float FloatNumber = 1.123123f;
        double DoubleNumber = 1;
        Double nonPrimitiveDoubleNumber;
        System.out.println(DoubleNumber);

        int NewNumber = 0;
        //NewNumber++ //it will make NewNumber+Package_01 each time forever or until it is stopped


        String word = "adasda"; /*String written with capital S at its beginning because String is an object class in java language.
        Primitive will only represent value for me while as an object will give me much mroe options. Object class takes less of memory also but it is not much of a difference.*/

        word += " newword";


        char character1 = 'a'; //only single ' quotation mark, NOT " and only Package_01 character.
        boolean trueOrFalse = true;

//Ctrl+D duplicates current line

//+, -, *, /, %
        int a = 5;
        double b = 10;
        double result = a / b; //if 5/10=0.5, as an integer the result will be 0 - we would need double number for exact value, obviously also "b" number.
        System.out.println(result);

// <, >, ==, !=, <=, >=

        boolean isBigger = a > b;
        System.out.println(isBigger);
        //boolean isBigger = a == b;
        //boolean isBigger = a != b;

//&&, || - and, or
        //expresssion && expression - true only if both expressions are true

        if (!isBigger) {
            System.out.println("The expression is true.");
        } //!isBigger - ! negates the effects - run the code only if "isBigger" is false

        boolean trueValue = true;
        boolean falseValue = false;
        if (trueValue && falseValue) {
            System.out.println("The expression was true");
        }

        if (trueValue && falseValue) {
            System.out.println("The expression was true");
        } else if (trueValue) {
            System.out.println("else if branch is executed");
        } else {
            System.out.println("Every else ifs failed so final 'else' code part was executed.");
        }

//Loops (when I know how many specific times I want to take):
for (int i = 0; i < 10; i++) {System.out.println("Value of: " + i);}
for (int i = 20; i > 10; i--) {System.out.println("Value of: " + i);}

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println("even " + i);
            } else {
                System.out.println("odd " + i);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner for loop " +j);
            }
            System.out.println("Outer  for loop " +i);
        }

//While loops (when I don't know how many times I want to take):
int i = 5;
        while(i > 0) {System.out.println("The i was greater than 0! " + i);
        i--;
        }

 //Do-while loop (it is guaranteed that it will be executed at least once
        do {
            System.out.println(i); i++;
        }
        while(i > 5);

//Switch
        Scanner myNewScanner = new Scanner(System.in);
        int day = myNewScanner.nextInt(); //if we type a dot behind our scanner name, there are more options available apart of ".nextInt()";
        /*if (day == Package_01) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday")
        }*/


        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: System.out.println("Not a valid day");
            break;
        }






    }
}



