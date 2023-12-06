package Getting_Started_as_a_Java_Developer.Java_Algorithms.Arrays;

public class e02_03 {
    public static void main(String[] args) {

        // 2. Array Algorithms
        // Binary search in Java

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 14};


        System.out.println(binarySearch2(arr,1));
        System.out.println(binarySearch2(arr,4));
        System.out.println(binarySearch2(arr,12));

        System.out.println(binarySearch2(arr,7));
    }
    public static boolean binarySearch(int[] arr, int item){
        int min = 0;
        int max = arr.length - 1;


        while(min < max) {
            int mid = (min + max) / 2;
            if(item == arr[mid]){
                return true;
            }else if(item < arr[mid]){
                max = mid - 1;
            }else {
                min = mid +1;
            }
        }

        return false;
    }


    // Created by me before watching tutorial as an exercise
    public static boolean binarySearch2(int[] arr, int item){
        int min = 0;
        int max = arr.length - 1;
        int current = (min + max) / 2;


        while(min <= max){



            if(arr[min] == item || arr[max] == item || arr[current] == item){
                return true;
            }

            if(arr[current] < item){
                min = current + 1;
                current = (min + max) / 2;
            } else if (arr[current] > item ) {
                max = current - 1;
                current = (min + max) / 2;
            }

        }



        return false;
    }



}
