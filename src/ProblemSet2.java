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

         // System.out.print("\nEnter your first name: ");
         // String firstName = in.nextLine();
         //
         // System.out.print("Enter your last name: ");
         // String lastName = in.nextLine();
         //
         // System.out.print("Enter your grade: ");
         // int gradeLevel = in.nextInt();
         //
         // System.out.print("Enter your age: ");
         // int age = in.nextInt();
         // in.nextLine();
         //
         // System.out.print("Enter your hometown: ");
         // String homeTown = in.nextLine();
         //
         //
         // System.out.println("\nNAME \t :" + firstName + " " + lastName);
         // System.out.println("GRADE \t :" + gradeLevel);
         // System.out.println("AGE \t :" + age);
         // System.out.println("HOMETOWN :" + homeTown);

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         System.out.print("Enter a dollar amount: ");
         double moneyTotal = in.nextDouble();

         final double dollarValue = 1;
         final double quarterValue = .25;
         final double dimeValue = .1;
         final double nickelValue = .05;




         double moneyLeft = moneyTotal % dollarValue;
         double dollarAmount = moneyTotal-(moneyLeft);
         int integerDollarAmount = (int) Math.round (dollarAmount);
         System.out.println("DOLLARS\t : " + integerDollarAmount);


         double quarterAmount = (moneyLeft-(moneyLeft % quarterValue))/quarterValue;
         moneyLeft = moneyTotal-dollarAmount-(quarterAmount*quarterValue);
         int integerQuarterAmount = (int) Math.round (quarterAmount);
         System.out.println("QUARTERS : " + integerQuarterAmount);


         double dimeAmount = (moneyLeft-(moneyLeft % dimeValue))/dimeValue;
         moneyLeft = moneyTotal-dollarAmount-(quarterAmount*quarterValue)-(dimeAmount*dimeValue);
         int integerDimeAmount = (int) Math.round (dimeAmount);
         System.out.println("DIMES\t : " + integerDimeAmount);


         double nickelAmount = (moneyLeft-(moneyLeft % nickelValue))/nickelValue;
         moneyLeft = moneyTotal-dollarAmount-(quarterAmount*quarterValue)-(dimeAmount*dimeValue)-(nickelAmount*nickelValue);
         int integerNickelAmount = (int) Math.round (nickelAmount);
         System.out.println("NICKELS\t : " + integerNickelAmount);

         double pennieAmount = moneyLeft*100;
         int integerPennieAmount = (int) Math.round (pennieAmount);
         System.out.println("PENNIES\t : " + integerPennieAmount);



        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         System.out.print("Enter a dollar amount: ");
         moneyTotal = in.nextDouble();

         final double tenDollarBillValue = 10;
         final double fiveDollarBillValue = 5;

         double tenDollarBillAmount = (moneyTotal-(moneyTotal%tenDollarBillValue))/tenDollarBillValue;
         int integerTenDollarBillAmount = (int) Math.round (tenDollarBillAmount);

         double fiveDollarBillAmount = ((moneyTotal-(tenDollarBillAmount*tenDollarBillValue)%fiveDollarBillValue))/fiveDollarBillValue;
         int integerFiveDollarBillAmount = (int) Math.round (fiveDollarBillAmount);





         moneyLeft = moneyTotal % dollarValue;
         dollarAmount = moneyTotal-(moneyLeft);
         integerDollarAmount = (int) Math.round (dollarAmount);

         int billsTotal = integerTenDollarBillAmount + integerFiveDollarBillAmount;
         System.out.println(billsTotal);

         quarterAmount = (moneyLeft-(moneyLeft % quarterValue))/quarterValue;
         moneyLeft = moneyTotal-dollarAmount-(quarterAmount*quarterValue);
         integerQuarterAmount = (int) Math.round (quarterAmount);


         dimeAmount = (moneyLeft-(moneyLeft % dimeValue))/dimeValue;
         moneyLeft = moneyTotal-dollarAmount-(quarterAmount*quarterValue)-(dimeAmount*dimeValue);
         integerDimeAmount = (int) Math.round (dimeAmount);


         nickelAmount = (moneyLeft-(moneyLeft % nickelValue))/nickelValue;
         moneyLeft = moneyTotal-dollarAmount-(quarterAmount*quarterValue)-(dimeAmount*dimeValue)-(nickelAmount*nickelValue);
         integerNickelAmount = (int) Math.round (nickelAmount);

         pennieAmount = moneyLeft*100;
         integerPennieAmount = (int) Math.round (pennieAmount);

         int coinsTotal = integerQuarterAmount+integerDimeAmount+integerNickelAmount+integerPennieAmount;
         System.out.println(coinsTotal);


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
