/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         *git add [filename]
         *git commit -m "comment"
         *git push origin master
         */

         // System.out.print("\nEnter your first name: ");
         // String firstName = in.nextLine();
         // System.out.print("Enter your last name: ");
         // String lastName = in.nextLine();
         // System.out.print("Enter your grade: ");
         // int grade = in.nextInt();
         // System.out.print("Enter your age: ");
         // int age = in.nextInt();
         // in.nextLine();
         // System.out.print("Enter your hometown: ");
         // String hometown = in.nextLine();
         //
         // System.out.println("\nNAME     : " + firstName + " " + lastName);
         // System.out.println("GRADE    : " + grade);
         // System.out.println("AGE      : " + age);
         // System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmount = in.nextDouble();
         dollarAmount = dollarAmount*100;

         int bills = (int) (dollarAmount/100);
         dollarAmount = dollarAmount%100;

         int quarters = (int) (dollarAmount/25);
         dollarAmount = dollarAmount%25;

         int dimes = (int) (dollarAmount/10);
         dollarAmount = dollarAmount%10;

         int nickels = (int) (dollarAmount/5);
         dollarAmount = dollarAmount%5;

         int pennies = (int) (dollarAmount/1);
         dollarAmount = dollarAmount%1;

         System.out.println("\nDOLLARS  : " + bills);
         System.out.println("QUARTERS : " + quarters);
         System.out.println("DIMES    : " + dimes);
         System.out.println("NICKELS  : " + nickels);
         System.out.println("PENNIES  : " + pennies);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */



        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
