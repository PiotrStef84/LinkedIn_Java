package Getting_Started_as_a_Java_Developer.Java_Algorithms.HashBasedStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class e05_03 {

    public static void main(String[] args) {

        // 5. Algorithms for Hash-Based Structures
        // 5.3. HashMap and HashSet operations in Java

        /* Challenge: Find items present in first array, but not in
        * second array.
        * {8, 0, 1, 7, 3}
        * {5, 7, 8, 0, 2} */

        int[] first = {8,0,1,7,3};
        int[] second = {5,7,8,0,2};

        System.out.println((findMissingElements(first, second)));

        findMissingElements(new int[]{1,2,3,4}, new int[]{1,3}).forEach(System.out::println);
    }

    public static List<Integer> findMissingElements(int[] firstArr, int[] secondArr){

        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int number : secondArr){
            hashSet.add(number);
        }

        for (int number : firstArr){
            if(!hashSet.contains(number)){
                missingElements.add(number);
            }
        }

        return missingElements;
    }


}
