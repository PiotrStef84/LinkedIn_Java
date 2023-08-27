package Java_Algorithms.String;

public class e01_02 {

    // 1.2. Validate strings in Java: Specific properties

    public static void main(String[] args) {

        System.out.println(isPasswordComplex("HELLO"));
        System.out.println(isPasswordComplex("Hello"));
        System.out.println(isPasswordComplex("hel1o"));
        System.out.println(isPasswordComplex("HElL0"));
        System.out.println(isPasswordComplex("He11O"));
    }

    // checking if String contains
    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }
}
