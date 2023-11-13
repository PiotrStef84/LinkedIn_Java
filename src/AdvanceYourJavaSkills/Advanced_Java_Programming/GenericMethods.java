package AdvanceYourJavaSkills.Advanced_Java_Programming;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    // Advanced Java Programming
    // 2.2. Generic methods in Java
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};


    // iterates through objects in an array and adds them to the list
//    public static List arrayToList(Object[] array, List<Object> list) {
//        for (Object object : array) {
//            list.add(object);
//        }
//        return list;
//    }

    // Introducing generics to keep the code flexible, and being able to discover potential errors in the code
    public static <T> List<T> arrayToList(T [] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
    }
}
