import java.util.ArrayList;
import java.util.*;

public class Hashmapex {
    public static void main(String[] args) {
        int[] nums = { 1,1,1,2,2,3,3,3,3,4};
        // int k = 2 ;
        Map<Integer,Integer> hm = new HashMap<>();
        // ArrayList<Integer> al = new ArrayList<>();
        for(int num : nums){
            hm.put(num , hm.getOrDefault(num,0) + 1);
        }
        
            System.out.println(hm);
        
        // System.out.println(Math.max(k, k));
        // System.out.println(al);
    }
}
