package Java_Algorithms.String;

public class s01_01 {

    public static void main(String[] args) {

        System.out.println(isUppercase("HeLLO"));
        System.out.println(isUppercase("HELLO"));

        System.out.println(isLowercase("hoMe"));
        System.out.println(isLowercase("home"));
    }

    public static boolean isUppercase(String string){
        return string.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s){
        // s.chars().noneMatch(Character::isUpperCase);
        return s.chars().allMatch(Character::isLowerCase);
    }

}
