import java.util.ArrayList;

public class RecArrayList {
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 4, 4, 6, 4 };
        int target = 4;
        // ! first func -------->1
        ArrayList<Integer> list = new ArrayList<>();
        findAllIndexWithListasParam(arr, 0, target, list);
        System.out.println(list);

        // ! second func ------> 2
        System.out.println(findAllIndex(arr, 0, target));

    }
    // ! -----------------> 1
    // ! passing the list as argumant to the function

    static ArrayList<Integer> findAllIndexWithListasParam(int[] arr, int index, int target, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        } else if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndexWithListasParam(arr, index + 1, target, list);

    }

    // ! -------------> 2
    // ! Do not pass the list as argumant to the function
    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        } else if (arr[index] == target) {
            list.add(index);
        }
        // ! store the ans from below calls in an list of " ans "
        ArrayList<Integer> ans = findAllIndex(arr, index + 1, target);

        if (ans != null) {
            for (int el : ans) {
                list.add(el);
            }

        }

        // ? list.addAll(ans); ======> instead of above if condition

        return list;
    }

}
