import java.util.*;
public class BoyerMoore{
 public static void main(String args[]) {
 Scanner s=new Scanner(System.in);
 System.out.println("enter text");
String text=s.next();
System.out.println("enter Pattern");
String pattern=s.next();
test(text, pattern);
 }
 public static void test(String text, String word) {
 char[] textC = text.toCharArray();
 char[] wordC = word.toCharArray();
 List<Integer> positions = bm(textC, wordC);
 if (!positions.isEmpty()) {
 System.out.println("Pattern Found at Positions: ");
 for (int position : positions) {
 System.out.println(position);
 }
 } else {
 System.out.println("Pattern Not Found");
 System.out.println("\ttext: " + text);
 System.out.println("\tword: " + word);
 }
 }
 public static List<Integer> bm(char[] string, char[] pat) {
 List<Integer> positions = new ArrayList<>();
 int[] d1 = makeD1(pat);
 int[] d2 = makeD2(pat);
 int i = pat.length - 1;
 int j = pat.length - 1;
 while (i < string.length) {
 if (string[i] == pat[j]) {
    if (j == 0) {
        positions.add(i);
        i += pat.length;
        j = pat.length - 1;
        } else {
        i--;
        j--;
        }
        } else {
        int x = d1[string[i]];
        int y = d2[j];
        i += Math.max(x, y);
        j = pat.length - 1;
        }
        }
        return positions;
        }
        public static int[] makeD1(char[] pat) {
        int[] table = new int[255];
        for (int i = 0; i < 255; i++) {
        table[i] = pat.length;
        }
        for (int i = 0; i < pat.length - 1; i++) {
        table[pat[i]] = pat.length - 1 - i;
        }
        return table;
        }
        public static boolean isPrefix(char[] word, int pos) {
        int suffixlen = word.length - pos;
        for (int i = 0; i < suffixlen; i++) {
        if (word[i] != word[pos + i]) {
        return false;
        }
        }
        return true;
        }
       public static int suffix_length(char[] word, int pos) {
        int i;
        for (i = 0; ((word[pos - i] == word[word.length - 1 - i]) & (i < pos)); i++) {
        }
        return i;
        }
        public static int[] makeD2(char[] pat) {
        int[] delta2 = new int[pat.length];
        int p;
        int last_prefix_index = pat.length - 1;
        for (p = pat.length - 1; p >= 0; p--) {
        if (isPrefix(pat, p + 1))
        last_prefix_index = p + 1;
        delta2[p] = last_prefix_index + (pat.length - 1 - p);
        }
        for (p = 0; p < pat.length - 1; p++) {
        int slen = suffix_length(pat, p);
        if (pat[p - slen] != pat[pat.length - 1 - slen])
        delta2[pat.length - 1 - slen] = pat.length - 1 - p + slen;
        }
        return delta2;
        }
       }
