package Getting_Started_as_a_Java_Developer.Java_Algorithms.String;

public class e01_03 {

    // 1.3. Normalize strings in Java.

    public static void main(String[] args) {

        String toNormalize = "HeLLo,  ";
        System.out.println("String " + toNormalize + " after normalization equals " + normalizeString("HeLLo,  "));
        String hello = "    Hello there, BUDDY";
        System.out.println(normalizeString(hello));

    }

    public static String normalizeString(String s){
//        String lowercase = s.toLowerCase();
//        String trimmed = lowercase.trim();
//        String normalize = trimmed.replace(",","");
//
//        String normalized = s.toLowerCase().trim().replace(",","");

        return s.toLowerCase().trim().replace(",","");
    }
}
