package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {

        String adjective = "";
        String season = "";
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an adjective");
        adjective = scanner.next();

        System.out.println("Please enter a season of the year");
        season = scanner.next();

        System.out.println("Please enter a whole number");
        number = scanner.nextInt();


        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day," +
                " I drink a minimum of " + number + " cups of coffee.");
    }
}
