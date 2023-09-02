package Java_Algorithms.Arrays;

import java.util.Arrays;

public class e02_06 {
    public static void main(String[] args) {

        // 2. Array Algorithms
        // Challenge - Rotate an Array.

        /* Create an algorithm that rotates the contents
        * of an array to the left by one space
        * Input: {1,2,3,4,5,6}
        * Output: {2,3,4,5,6,1}
        * This rotation should be done in place.
        * A new array should not be created.
        *
        * BONUS: Create an algorithm that rotates the array's
        * contents to the right. */

        int[] arr = { 1, 2, 3, 5, 7, 9, 12 };
        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("--------------------");

        int[] arr2 = { 1, 2, 3, 4, 5, 6};
        rotateArrayLeft(arr2);
        Arrays.stream(arr2).forEach(System.out::println);

        System.out.println("------- Right and Left --------");

        int[] arr3 = { 1, 2, 3, 4, 5, 6};
        rotateArrayLeft(arr3);
        rotateArrayRight(arr3);
        Arrays.stream(arr3).forEach(System.out::println);
    }

    private static void rotateArrayLeft(int[] arr) {

        int temp = 0;

        for (int i= 0; i < arr.length -1; i++ ){
            if(i == 0){
                temp = arr[i];
            }
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;
    }

    private static void rotateArrayRight(int[] arr) {

        int temp = 0;

        for (int i= arr.length - 1 ; i > 0; i-- ){
            if(i == arr.length - 1){
                temp = arr[i];
            }
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }
}
