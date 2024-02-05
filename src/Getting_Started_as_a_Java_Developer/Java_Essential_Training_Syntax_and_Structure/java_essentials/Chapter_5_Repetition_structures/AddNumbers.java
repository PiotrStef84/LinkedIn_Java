package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials.Chapter_5_Repetition_structures;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    // Java Essential Training: Syntax and Structure
    // 05_02 Do while Loop

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;

        do{
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to try again");
            System.out.println("Press: ");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            runAgain = scanner.nextInt();

        }while (runAgain == 1);


        scanner.close();
    }
}
