
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Permutations {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;
        generate(idx, arr, ans);
        System.out.println(ans);

    }

    static void generate(int idx, int[] nums, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(i, idx, nums);
            generate(idx + 1, nums, ans);
            swap(i, idx, nums);
        }
    }

    static void swap(int i, int j, int[] str) {
        int temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}