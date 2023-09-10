import java.lang.reflect.Array;
import java.util.Arrays;

public class EvenorOdd {
    public static void main(String[] args) {
        // int n = 9823749;
        // System.out.println(isodd(n));
        String s = "anagram";
        String t = "nagrama";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

        public static boolean isAnagram(String s, String t) {
            int[] alphabet = new int[26]; // Initialize an array to count character occurrences.
    
            // Count character occurrences in string s.
            for (int i = 0; i < s.length(); i++) {
                alphabet[s.charAt(i) - 'a']++;
                System.out.println("s" + "" + i +Arrays.toString(alphabet));
            }
    
            // Decrement character occurrences in string t.
            for (int i = 0; i < t.length(); i++) {
                alphabet[t.charAt(i) - 'a']--;
                System.out.println("t" + ""+  i + Arrays.toString(alphabet));

            }
    
            // Check if all character counts in the array are zero (indicating an anagram).
            for (int count : alphabet) {
                if (count != 0) {
                    return false; // Not an anagram.
                }
            }
    
            return true; // It's an anagram.
        }
    
    

    // static boolean isodd(int n) {
    //     return (n & 1) == 1;
    // }
}
