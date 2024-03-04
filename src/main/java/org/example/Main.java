package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        //1. Solving a quadratic equation
        QuadraticEquation solution = new QuadraticEquation();
        System.out.println("Enter the coefficients of the quadratic equation a, b, c separately each: ");
        solution.SetParameters(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(solution.WhatDiscriminator());
        System.out.println("Your solution: " + "x1 = " + solution.Negative() + "; x2 = " + solution.Positive());

        //2.  What quarter?
        System.out.println("Enter the coordinates of the point: ");
        Points points = new Points(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(points.IsItNull());

        //3. Checking a number for parity and ambiguity
        System.out.println("Enter your number for checking a number for parity and ambiguity: ");
        Parity parity = new Parity(scanner.nextInt());
        System.out.println(parity.WhatParity() + parity.WhatAmbiguity());

        //4.1 Solving an individual task
        System.out.println("Enter your number: ");
        IndividualTask individualTask = new IndividualTask(scanner.nextDouble());
        System.out.println("Your result: " + individualTask.Solution());

        //4.2 Solving an individual task
        DaysMonthsYears daysMonthsYears = new DaysMonthsYears();

        //4.2.1 Working day
        System.out.println("Enter number of days to check it's status: ");
        System.out.println(daysMonthsYears.DaysInWeek(scanner.nextInt()));

        //4.2.2 Season of years
        System.out.println("Enter number of month to check what season it is: ");
        System.out.println(daysMonthsYears.MonthsInYear(scanner.nextInt()));

        //4.2.3 Days in month
        System.out.println("Enter number of month to check the number of days in it: ");
        System.out.println(daysMonthsYears.DaysInMonth(scanner.nextInt()));

        //4.2.4 Text menu about messages
        do {
            System.out.println("We in our computer... ");
            TextMenu textMenu = new TextMenu();
            while(true){
                System.out.println("""
                        Get started by pressing "1";
                        Press "2" to continue;
                        Press "3" to continue;\s""");
                System.out.println(textMenu.massage(scanner.nextInt()));
                System.out.println("Do you want to continue? Enter \"1\" to continue or \"2\" to close the program.");
                if(scanner.nextInt() != 1) break;
            }
            System.out.println("Enter \"True\" to continue or \"False\" to close the program.");
        } while(scanner.nextBoolean());

        //4.2.5 Subjects in days
        System.out.println("Enter the number of the subject that are available today: ");
        System.out.println(daysMonthsYears.NumberOfSubject(scanner.nextInt()));

        //4.2.6 Minutes in hour
        System.out.println("Enter the minute number in the hour: ");
        System.out.println(daysMonthsYears.QuarterOfDay(scanner.nextInt()));

        //4.2.6 Text menu about two numbers
        do {
            System.out.println("Enter two real numbers: ");
            TextMenu textMenu = new TextMenu(scanner.nextDouble(), scanner.nextDouble());
            while(true){
                System.out.println("""
                        To calculate their product, press "1";
                        To calculate their sum, press "2";
                        Press "3" to calculate their difference:\s""");
                System.out.println(textMenu.menu(scanner.nextInt()));
                System.out.println("Do you want to choose another operation? Enter \"1\" to continue or \"2\" to close the program.");
                if(scanner.nextInt() != 1) break;
            }
            System.out.println("Do you want to these arithmetic operations for two other numbers? Enter \"True\" to continue or \"False\" to close the program.");
        } while(scanner.nextBoolean());
    }
}