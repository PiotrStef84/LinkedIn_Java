package Java_Algorithms.Arrays;

public class e02_01 {
    public static void main(String[] args) {

        // 2. Array Algorithms
        // Linear search arrays in Java

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr, 9));
        System.out.println(linearSearch(arr, 4));
    }

    public static boolean linearSearch(int[] arr, int item){

        for (int i = 0; i< arr.length; i++){
            if(i == item){
                return true;
            }
        }
        return false;
    }
}
