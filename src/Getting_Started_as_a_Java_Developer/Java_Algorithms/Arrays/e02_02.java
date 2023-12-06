package Getting_Started_as_a_Java_Developer.Java_Algorithms.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class e02_02 {
    public static void main(String[] args) {

        // 2. Array Algorithms
        // Linear search arrays with Java streams

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr, 9));
        System.out.println(linearSearch(arr, 4));

        // method using streams
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 12).ifPresent(System.out::println);
    }
    public static OptionalInt linearSearch2(int[] arr, int item){
       return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }


    public static Integer linearSearch(int[] arr, int item){
        for(int current : arr){
            if(current == item){
                return item;
            }
        }
        return null;
    }
}
