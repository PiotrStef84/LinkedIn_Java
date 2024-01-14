package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials;

import java.util.Scanner;

public class GrossPayCalculator {

    // 2.3. Java Basics - Main method
    // 02_03 Main method

    public static void main(String[] args) {

        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 25.5;

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. Display results
        System.out.println("Gross pay: " + grossPay);

    }
}
