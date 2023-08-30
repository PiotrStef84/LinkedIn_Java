package Java_Algorithms.String;

public class e01_05 {
    public static void main(String[] args) {
        // 1. String Algorithms
        // Apply custom parsing to search algorithms.

        System.out.println(isAtEvenIndex("HeLLo" , 'L'));
        System.out.println(isAtEvenIndex("HeLLo" , 'y'));
        System.out.println(isAtEvenIndex("" , 'L'));

    }
    // We want to find out if a certain character exist at even index
    public static boolean isAtEvenIndex(String s, char item){
        if( s == null || s.isBlank()){
            return false;
        }

        for(int i = 0; i< s.length() / 2 + 1; i++){
            if(s.charAt(i) == item){
                return true;
            }
        }
        return false;
    }
}
