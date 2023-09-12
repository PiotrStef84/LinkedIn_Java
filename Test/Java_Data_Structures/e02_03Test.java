package Java_Data_Structures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class e02_03Test {

    e02_03 e02_03 = new e02_03();

    @Test
    void arrayToUpperCase() {
        String[] input = new String[]{"cat", "dog", "fish"};
        e02_03.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT", "DOG", "FISH"}, input);
    }

    @Test
    void incrementArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        e02_03.incrementArray(input);
        assertArrayEquals(new int[]{2, 3, 4, 5, 6}, input);
    }
}