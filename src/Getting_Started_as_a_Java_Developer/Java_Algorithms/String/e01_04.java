package Getting_Started_as_a_Java_Developer.Java_Algorithms.String;

public class e01_04 {
    public static void main(String[] args) {
        // 1. String Algorithms
        // Basic parsing and searching strings in Java.

        String s = "HeLLo";
        System.out.println(s.contains("LL"));

        parseContents(s);
    }
    // Iterating through the string to work with single characters ... shown using 2 loops
    public static void parseContents(String s){
        System.out.println("Option 1");
        for(char c : s.toCharArray()){
            System.out.println(c);
            }

        System.out.println("Option 2");
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
        }
    }
