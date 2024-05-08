import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            String str = sc.next();
            int firstChar = str.charAt(0) - '0';
            int secondChar = str.charAt(1) - '0';
            int totalhrs = firstChar * 10 + secondChar;
            int newformat = 0;
            if (totalhrs <= 12 && totalhrs != 0) {
                if (totalhrs == 12) {
                    System.out.println("12" + str.substring(2) + " PM");

                } else {
                    System.out.println(str + " AM");
                }
            } else {
                if (totalhrs == 0) {
                    System.out.println("12" + str.substring(2) + " AM");
                } else {
                    newformat = totalhrs - 12;
                    if (newformat < 10) {
                        System.out.print("0");
                    }
                    System.out.println(newformat + str.substring(2) + " PM");
                }
            }
        }
    }
}
