package Java_Algorithms.QueuesAndStacks;

import java.util.Stack;

public class e04_07 {
    public static void main(String[] args) {

        // 4.7. Java Algorithms - Queue and Stack Algorithms
        // Challenge Next greater element

        // Stack can be useful for algorithms where you need to keep track of state

        /* Challenge: Print the next greater element for every element in the array
        NOTE: The next greater element is the first larger element on the right side of the array.

        Example:
        Input: {16, 7, 2, 15}  Output: 16 -> -1, 7 -> 15, 2 -> 15, 15 -> -1;
        Input: {4, 5, 2, 35}   Output: 4 -> 5, 5 -> 35, 2 -> 35, 35 -> -1;

        Solution using stack allows to iterate through our array input only once rather than multiple times or even n times.
        This gives us a linear time complexity.
         */

        printNextGreaterElement(new int[]{16,7,2,15});
        printNextGreaterElement(new int[]{12,4,22,11, 6, 2, 14, 54, 15, 6, 7,11});
    }

    public static void printNextGreaterElement(int[] arr){

        if(arr.length == 0){
            System.out.println("Provided array must not be empty");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for(int i = 1; i< arr.length; i++){
            int next = arr[i];
            if(!stack.isEmpty()){
                int popped = stack.pop();
                while (popped < next){
                    System.out.println(popped + " --> " + next);
                    if(stack.isEmpty()){
                        break;
                    }
                    popped = stack.pop();
                }

                if(popped > next){
                    stack.push(popped);
                }
            }
            stack.push(next);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop() + " --> " + -1);
        }

    }
}
