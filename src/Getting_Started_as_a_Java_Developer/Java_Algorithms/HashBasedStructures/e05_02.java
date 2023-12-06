package Getting_Started_as_a_Java_Developer.Java_Algorithms.HashBasedStructures;

import java.util.HashMap;
import java.util.HashSet;

public class e05_02 {
    public static void main(String[] args) {

        // 5. Algorithms for Hash-Based Structures
        // 5.2. HashMap and HashSet operations in Java

        Employee employee = new Employee("Robby", 3827,
                "Technology");
        Employee employee2 = new Employee("Bobby", 9612,
                "Marketing");
        Employee employee3 = new Employee("Sally", 2519,
                "Sales");

        HashMap<Integer, Employee> employeesByID = new HashMap<>();
        employeesByID.put(employee.getId(), employee);
        employeesByID.put(employee2.getId(), employee2);
        employeesByID.put(employee3.getId(), employee3);

        Employee retrievedEmployee = employeesByID.get(9612);

        if(retrievedEmployee != null){
            System.out.println(retrievedEmployee.getName() + " : " +
                        retrievedEmployee.getDepartment());
        }else {
            System.out.println("Employee not found");
        }

        // HashSet - it can contain only unique values

        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("S2TK6I");
        productCodes.add("AB9867");
        productCodes.add("H5J781");

        System.out.println(productCodes.contains("H5J781"));
        System.out.println(productCodes.contains("TSG741"));

    }
}
