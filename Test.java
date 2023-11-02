import java.util.*;
public class Test {
    public static void main(String[] args) {
       int[] nums = {1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,4,4,4,4};
         int k = 2 ;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
     static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        // ArrayList<Integer> al = new ArrayList<>();/
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0) + 1);
        }
       List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
       System.out.println(entryList);
        Collections.sort(entryList, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println(entryList.get(0));

        // Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        // for (Map.Entry<Integer, Integer> entry : entryList) {
        //     sortedMap.put(entry.getKey(), entry.getValue());
        // }
        // System.out.println("sorted"+""+sortedMap);
        int[] result = new int[k]; 
        
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }
        
        return result;
    }
}
