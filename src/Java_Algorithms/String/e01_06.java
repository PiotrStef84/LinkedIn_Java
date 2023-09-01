package Java_Algorithms.String;

public class e01_06 {
    public static void main(String[] args) {

        // 1. String Algorithms
        // Create algorithm-driven strings in Java.

        System.out.println(reverse(""));
        System.out.println(reverse(null));
        System.out.println(reverse("EROL"));
        System.out.println(reverse("unacceptable"));

    }

    public static String reverse(String s){
        // Just covering base cases
        if(s == null || s.isEmpty()){
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        for(int i = s.length() -1; i >= 0; i--){
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    // Converting data into datatype that have a built-in reverse method
    public static String reverse2(String s){
        if(s == null || s.isEmpty()){
            return s;
        }

        StringBuilder reversed = new StringBuilder();
        return reversed.reverse().toString();
    }
}
