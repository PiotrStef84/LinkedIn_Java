package Getting_Started_as_a_Java_Developer.Java_Algorithms.Java_Data_Structures;

public class e02_03 {
    public void arrayToUpperCase(String[] input) {
        for(int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }
    }

    public void incrementArray(int[] input) {
        // Add code here to increment each element in the array by 1
        for(int i = 0; i<input.length; i++){
            input[i] = input[i] + 1;
        }
    }

}

