package Standalone_courses.Advanced_Java.Chapter_1_Streams_and_Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodeChallenge {

    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student("Amine", "Ousmane", "Computer Science", Map.of("Algorithms", 90, "Data Structures", 80, "Calculus", 85)),
                new Student("Lily-Ann", "Smith", "Mathematics", Map.of("Algorithms", 80, "Data Structures", 75, "Calculus", 88)),
                new Student("Li", "Wei", "Computer Science", Map.of("Algorithms", 92, "Data Structures", 89, "Calculus", 88)),
                new Student("Jessica", "Rodriguez", "Mathematics", Map.of("Algorithms", 85, "Data Structures", 80, "Calculus", 89)));

        String major = "Computer Science";

        int result = findAnswer(students, major);
    }



    // Return the highest grade for the students with a specific major
    static int findAnswer(List<Student> students, String major) {

        List<Student> newList = students.stream()
                .filter(s -> s.getMajor().equals(major))
                .collect(Collectors.toList());

        return 0;
    }
}
