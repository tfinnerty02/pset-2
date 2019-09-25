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
         *
         * git add [filename]
         * git commit -m "comment"
         * git push origin master
         */

        System.out.print("\nEnter your first name: ");
        String firstName = in .nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in .nextLine();
        System.out.print("Enter your grade: ");
        int grade = in .nextInt();
        System.out.print("Enter your age: ");
        int age = in .nextInt(); in .nextLine();
        System.out.print("Enter your hometown: ");
        String hometown = in .nextLine();

        System.out.println("\nNAME     : " + firstName + " " + lastName);
        System.out.println("GRADE    : " + grade);
        System.out.println("AGE      : " + age);
        System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

        System.out.print("\nEnter a dollar amount: ");
        double dollarAmount = in .nextDouble();
        dollarAmount = dollarAmount * 100;

        int bills = (int)(dollarAmount / 100);
        dollarAmount = dollarAmount % 100;

        int quarters = (int)(dollarAmount / 25);
        dollarAmount = dollarAmount % 25;

        int dimes = (int)(dollarAmount / 10);
        dollarAmount = dollarAmount % 10;

        int nickels = (int)(dollarAmount / 5);
        dollarAmount = dollarAmount % 5;

        int pennies = (int)(dollarAmount / 1);
        dollarAmount = dollarAmount % 1;

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

        System.out.print("\nEnter a dollar amount: ");
        double dollarAmount3 = in .nextDouble();
        dollarAmount3 = dollarAmount3 * 100;

        int hundreds = (int)(dollarAmount3 / 10000);
        dollarAmount3 = dollarAmount3 % 10000;

        int twenties = (int)(dollarAmount3 / 2000);
        dollarAmount3 = dollarAmount3 % 2000;

        int tens = (int)(dollarAmount3 / 1000);
        dollarAmount3 = dollarAmount3 % 1000;

        int fives = (int)(dollarAmount3 / 500);
        dollarAmount3 = dollarAmount3 % 500;

        int dollarBills3 = (int)(dollarAmount3 / 100);
        dollarAmount3 = dollarAmount3 % 100;

        int quarters3 = (int)(dollarAmount3 / 25);
        dollarAmount3 = dollarAmount3 % 25;

        int dimes3 = (int)(dollarAmount3 / 10);
        dollarAmount3 = dollarAmount3 % 10;

        int nickels3 = (int)(dollarAmount3 / 5);
        dollarAmount3 = dollarAmount3 % 5;

        int pennies3 = (int)(dollarAmount3 / 1);
        dollarAmount3 = dollarAmount3 % 1;

        System.out.println("BILLS  : " + (hundreds + twenties + tens + fives + dollarBills3));
        System.out.println("COINS  : " + (quarters3 + dimes3 + nickels3 + pennies3));

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

        System.out.print("\nEnter a number of inches: ");
        int totalInches = in .nextInt();

        int miles = totalInches / 63360;
        totalInches = totalInches % 63360;

        int yards = totalInches / 36;
        totalInches = totalInches % 36;

        int feet = totalInches / 12;
        int inches = totalInches % 12;

        System.out.println("\nMILES  : " + miles);
        System.out.println("YARDS  : " + yards);
        System.out.println("FEET   : " + feet);
        System.out.println("INCHES : " + inches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

        System.out.print("\nEnter a number of centimeters: ");
        int centimeters = in .nextInt();

        int kilometers = centimeters / 100000;
        centimeters = centimeters % 100000;

        int meters = centimeters / 100;
        centimeters = centimeters % 100;

        System.out.println("\nKILOMETERS   : " + kilometers);
        System.out.println("METERS       : " + meters);
        System.out.println("CENTIMETERS  : " + centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

        System.out.print("\nEnter a diameter: ");
        double diameter = in .nextInt();

        double area = (Math.pow(diameter / 2, 2)) * Math.PI;
        double circumference = diameter * Math.PI;

        System.out.printf("\nAREA: %,.2f", area);
        System.out.printf("\nCIRCUMFERENCE: %,.2f\n", circumference);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

        System.out.print("\nEnter a length: ");
        int length = in .nextInt();
        System.out.print("Enter a width: ");
        int width = in .nextInt();

        System.out.println("\nAREA      : " + length * width);
        System.out.println("PERIMETER : " + 2 * length + 2 * width);
        System.out.printf("DIAGONAL  : %,.2f\n", Math.hypot(length, width));

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

        System.out.print("\nEnter a side length: ");
        int sideLength = in .nextInt();
        in.nextLine();

        double hexArea = ((3 * Math.sqrt(3)) / 2) * Math.pow(sideLength, 2);

        System.out.printf("\nAREA       : %,.2f\n", hexArea);
        System.out.println("PERIMETER  : " + 6 * sideLength);

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

        System.out.print("\nEnter a String: ");
        String originalString = in .nextLine();

        String firstHalf = originalString.substring(0, (int) Math.floor(originalString.length()) / 2);
        String secondHalf = originalString.substring((int) Math.floor(originalString.length()) / 2, originalString.length());

        System.out.println("\n" + secondHalf + firstHalf);


        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

        System.out.print("\nEnter your first name: ");
        String firstName10 = in .nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = in .nextLine();
        System.out.print("Enter last first name: ");
        String lastName10 = in .nextLine();

        System.out.println("\n" + firstName10.substring(0, 1) + middleName.substring(0, 1) + lastName10.substring(0, 1) + "\n");

        in .close();
    }
}
