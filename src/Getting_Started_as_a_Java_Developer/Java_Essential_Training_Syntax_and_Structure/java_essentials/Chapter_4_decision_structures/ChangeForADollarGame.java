package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials.Chapter_4_decision_structures;

import java.util.Scanner;

public class ChangeForADollarGame {

    // Java Essential Training: Syntax and Structure
    // 04_10 Challenge: Change for a dollar game.


    public static void main(String[] args) {

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();
    }
}
