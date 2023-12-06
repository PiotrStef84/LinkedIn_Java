package Getting_Started_as_a_Java_Developer.Java_Algorithms.HashBasedStructures;

import java.util.HashMap;

public class e05_04 {
    public static void main(String[] args) {

        // 5. Algorithms for Hash-Based Structures
        // 5.4 Use the HashMap type in Java algorithms

        /* Challenge: Display the count of each element in an unsorted array
        *  <key = element, value = count of element> */

        displayFrequency(new int[]{4,1,5,7,4,2,5,8,7,56,1,3,3,6,0});
    }

    public static void displayFrequency(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr) {
            if (!freqMap.containsKey(num)) {
                freqMap.put(num, 1);
            } else {
                // retrieving the value (number of appearances) and incrementing it.
                freqMap.put(num, freqMap.get(num) + 1);
            }
        }
        freqMap.forEach((key, value) -> System.out.println(key + " --> " + value));
    }
}
