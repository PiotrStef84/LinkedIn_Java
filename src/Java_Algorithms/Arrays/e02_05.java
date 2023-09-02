package Java_Algorithms.Arrays;

import java.util.Arrays;

public class e02_05 {
    public static void main(String[] args) {

        // 2. Array Algorithms
        // Reverse array in Java.

        int[] arr = { 1, 2, 3, 5, 7, 9, 12 };

        Arrays.stream(reverse(arr)).forEach(System.out::println);

        System.out.println("-----------------");
        int[] arr2 = { 4, 2, 3, 5, 7, 9, 12 };

        reverse2(arr2);
        Arrays.stream(arr2).forEach(System.out::println);
    }

    // Create new Array to hold reversed numbers.
    public static int[] reverse(int[] arr){
        int[] reverse = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            reverse[arr.length - 1 - i] = arr[i];
        }

        return reverse;
    }
    // return type is void because we only modify the existing array
    public static void reverse2(int[] arr){

        // Swap item at index (i) and item at index (arr.length - i -1 )
        for(int i = 0; i< arr.length /2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
