package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials;

import java.util.Scanner;

/*
If-Else Statement.
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don’t, they are informed of how many sales they were short.
*/
public class QuotaChecker {

    // Java Essential Training: Syntax and Structure
    // 04_02 If-else statements
    public static void main(String[] args){

        //Initialize known values
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make you quota. You were " + salesShort + " sales short");
        }

    }
}
