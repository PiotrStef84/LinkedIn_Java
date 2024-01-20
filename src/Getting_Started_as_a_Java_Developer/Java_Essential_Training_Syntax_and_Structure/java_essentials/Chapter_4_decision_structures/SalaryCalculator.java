package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials.Chapter_4_decision_structures;

import java.util.Scanner;

/*
If Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/
public class SalaryCalculator {

    // Java Essential Training: Syntax and Structure
    // 04_01 If statements

    public static void main(String[] args){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary += bonus;
        }


        //Output
        System.out.println("The employee's pay is $" + salary);
    }
}
