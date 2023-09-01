package Java_Algorithms.String;

public class e01_08 {
    public static void main(String[] args) {

        // 1. String Algorithms
        // Challenge: Reverse each word.

        System.out.println(reverseEachWord(null));
        System.out.println(reverseEachWord(""));
        System.out.println(reverseEachWord(" "));
        System.out.println(reverseEachWord("Sally is a great worker"));
        System.out.println(reverseEachWord("Active pesto pasta"));
        System.out.println(reverseEachWord("What I can do today"));
    }

    public static String reverseEachWord(String s){
        if(s == null || s.isBlank()){
            return s;
        }

        String[] arrOfStr = s.split(" ");
        StringBuilder full = new StringBuilder();

        for (String a : arrOfStr){
            StringBuilder reversed = new StringBuilder();
            for(int i = a.length() -1; i >= 0; i--){
                reversed.append(a.charAt(i));
            }
            full.append(reversed);
            full.append(" ");

        }


        return full.toString();
    }
}
