package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials.Chapter_4_decision_structures;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {

    public static void main(String[] args){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
    }
}
