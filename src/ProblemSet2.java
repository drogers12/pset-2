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
         */

        System.out.print("\nEnter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter your grade: ");
        String grade = in.nextLine();
        System.out.print("Enter your age: ");
        String age = in.nextLine();
        System.out.print("Enter your hometown: ");
        String hometown = in.nextLine();

        System.out.printf("\nNAME     : %s %s\n", firstName, lastName);
        System.out.printf("GRADE    : %s\n", grade);
        System.out.printf("AGE      : %s\n", age);
        System.out.printf("HOMETOWN : %s\n", hometown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

        final double VALUE_DOLLAR = 1.00;
        final double VALUE_QUARTER = 0.25;
        final double VALUE_DIME = 0.10;
        final double VALUE_NICKEL = 0.05;

        System.out.print("\nEnter a dollar amount: ");
        double value = in.nextDouble();

        double dollarsNeeded = Math.floor(value/VALUE_DOLLAR);
        value -= dollarsNeeded*VALUE_DOLLAR;
        double quartersNeeded = Math.floor(value/VALUE_QUARTER);
        value -= quartersNeeded*VALUE_QUARTER;
        double dimesNeeded = Math.floor(value/VALUE_DIME);
        value -= dimesNeeded*VALUE_DIME;
        double nickelsNeeded = Math.floor(value/VALUE_NICKEL);
        value -= nickelsNeeded*VALUE_NICKEL;
        double penniesNeeded = Math.floor(value/0.01);

        System.out.printf("\nDOLLARS  : %.0f\n", dollarsNeeded);
        System.out.printf("QUARTERS : %.0f\n", quartersNeeded);
        System.out.printf("DIMES    : %.0f\n", dimesNeeded);
        System.out.printf("NICKELS  : %.0f\n", nickelsNeeded);
        System.out.printf("PENNIES  : %.0f\n\n", penniesNeeded);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

        final double VALUE_TWENTY_DOLLAR = 20.00;
        final double VALUE_TEN_DOLLAR = 10.00;
        final double VALUE_FIVE_DOLLAR = 5.00;

        System.out.print("Enter a dollar amount: ");
        value = in.nextDouble();

        double twentiesNeeded = Math.floor(value/VALUE_TWENTY_DOLLAR);
        value -= twentiesNeeded*VALUE_TWENTY_DOLLAR;
        double tensNeeded = Math.floor(value/VALUE_TEN_DOLLAR);
        value -= tensNeeded*VALUE_TEN_DOLLAR;
        double fivesNeeded = Math.floor(value/VALUE_FIVE_DOLLAR);
        value -= fivesNeeded*VALUE_FIVE_DOLLAR;
        dollarsNeeded = Math.floor(value/VALUE_DOLLAR);
        value -= dollarsNeeded*VALUE_DOLLAR;
        quartersNeeded = Math.floor(value/VALUE_QUARTER);
        value -= quartersNeeded*VALUE_QUARTER;
        dimesNeeded = Math.floor(value/VALUE_DIME);
        value -= dimesNeeded*VALUE_DIME;
        nickelsNeeded = Math.floor(value/VALUE_NICKEL);
        value -= nickelsNeeded*VALUE_NICKEL;
        penniesNeeded = Math.floor(value/0.01);

        double billsNeeded = twentiesNeeded+tensNeeded+fivesNeeded+dollarsNeeded;
        double coinsNeeded = quartersNeeded+dimesNeeded+nickelsNeeded+penniesNeeded;

        System.out.printf("\nBILLS : %.0f\n", billsNeeded);
        System.out.printf("COINS : %.0f\n\n", coinsNeeded);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

        final double MILES_TO_INCHES = 63360;
        final double YARDS_TO_INCHES = 36;
        final double FEET_TO_INCHES = 12;

        System.out.print("Enter a number of inches: ");
        double inches = in.nextDouble();

        double miles = Math.floor(inches/MILES_TO_INCHES);
        inches -= miles*MILES_TO_INCHES;
        double yards = Math.floor(inches/YARDS_TO_INCHES);
        inches -= yards*YARDS_TO_INCHES;
        double feet = Math.floor(inches/FEET_TO_INCHES);
        inches -= feet*FEET_TO_INCHES;

        System.out.printf("\nMILES  : %.0f\n", miles);
        System.out.printf("YARDS  : %.0f\n", yards);
        System.out.printf("FEET   : %.0f\n", feet);
        System.out.printf("INCHES : %.0f\n\n", inches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

        final double KILOMETERS_TO_CENTIMETERS = 100000;
        final double METERS_TO_CENTIMETERS = 100;

        System.out.print("Enter a number of centimeters: ");
        double centimeters = in.nextDouble();

        double kilometers = Math.floor(centimeters/KILOMETERS_TO_CENTIMETERS);
        centimeters -= kilometers*KILOMETERS_TO_CENTIMETERS;
        double meters = Math.floor(centimeters/METERS_TO_CENTIMETERS);
        centimeters -= meters*METERS_TO_CENTIMETERS;

        System.out.printf("\nKILOMETERS  : %.0f\n", kilometers);
        System.out.printf("METERS      : %.0f\n", meters);
        System.out.printf("CENTIMETERS : %.0f\n\n", centimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

        System.out.print("Enter a diameter: ");
        double diameter = in.nextDouble();
        double radius = diameter/2;

        double circleArea = Math.PI*Math.pow(radius, 2);
        double circleCircumference = 2*Math.PI*radius;

        System.out.printf("\nAREA          : %.2f\n", circleArea);
        System.out.printf("CIRCUMFERENCE : %.2f\n\n", circleCircumference);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

        System.out.print("Enter a length: ");
        double rectLength = in.nextDouble();
        System.out.print("Enter a width: ");
        double rectWidth = in.nextDouble();

        double rectArea = rectLength*rectWidth;
        double rectPerimeter = 2*rectLength+2*rectWidth;
        double rectDiagonal = Math.hypot(rectLength, rectWidth);

        System.out.printf("\nAREA      : %.2f\n", rectArea);
        System.out.printf("PERIMETER : %.2f\n", rectPerimeter);
        System.out.printf("DIAGONAL  : %.2f\n\n", rectDiagonal);

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
