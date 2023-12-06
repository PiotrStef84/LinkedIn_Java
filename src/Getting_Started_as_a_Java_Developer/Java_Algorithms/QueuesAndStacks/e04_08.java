package Getting_Started_as_a_Java_Developer.Java_Algorithms.QueuesAndStacks;

import java.util.Stack;

public class e04_08 {
    // 4.7. Java Algorithms - Queue and Stack Algorithms
    // Challenge: Matching Parentheses


    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));


        System.out.println("-------- INTEGER ---------");
        System.out.println(hasMatchingParenthesesInt("((algorithm()))"));
        System.out.println(hasMatchingParenthesesInt("algorithm(("));
    }

    public static boolean hasMatchingParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            char current = s.charAt(i);

            if(current == '('){
                stack.push(current);
            } else if (current == ')') {
                if (!stack.isEmpty()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Using integer for instances with only one type of parentheses
    // This algorithm runs in O(n) time, O(1) space
    public static boolean hasMatchingParenthesesInt(String s) {
        int matchingSymbolTracker = 0;

        for(int i = 0; i< s.length(); i++){
            char current = s.charAt(i);

            if(current == '('){
                matchingSymbolTracker++;
            } else if (current == ')') {
                if (matchingSymbolTracker > 0){
                    matchingSymbolTracker--;
                }else {
                    return false;
                }
            }
        }
        return matchingSymbolTracker == 0;
    }
}
