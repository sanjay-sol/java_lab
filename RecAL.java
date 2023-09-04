import java.util.ArrayList;

public class RecAL {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 6, 4 };
        int target = 4;
        System.out.println(findAllIndex(arr, 0, target));
        // findAllIndex( arr , 0 , target);
        // System.out.println(list);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        } else if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ans = findAllIndex(arr, index + 1, target);

        if (ans != null) {
            for (int el : ans) {
                list.add(el);
            }

        }
        return list;
    }

}
