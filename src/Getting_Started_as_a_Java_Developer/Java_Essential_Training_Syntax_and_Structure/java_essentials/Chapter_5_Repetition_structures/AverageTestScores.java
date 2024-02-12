package Getting_Started_as_a_Java_Developer.Java_Essential_Training_Syntax_and_Structure.java_essentials.Chapter_5_Repetition_structures;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for(int i=0; i<numberOfStudents; i++){

            double total = 0;

            //Process a student test score
            for(int j=0; j<numberOfTests; j++){

                System.out.println("Enter test nr " + j+1 +" score");
                total += scanner.nextInt();
            }

        }



        scanner.close();
    }
}
