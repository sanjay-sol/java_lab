import java.util.*;
public class Hashmap {
 public static void main(String[] args) {
 HashMap<Integer, String> hm = new HashMap<Integer, String>();
 System.out.println("Is Empty or not:" + hm.isEmpty());
 hm.put(1, "A");
 hm.put(2, "B");
 hm.put(3, "C");
 System.out.println(hm);
 hm.remove(1);
 System.out.println("Elements :" + hm);
 hm.replace(1, "D");
 System.out.println("Elements :" + hm);
 System.out.println(hm.get(2));
 hm.clear();
 System.out.println("Elements :" + hm);
 System.out.println("size:" + hm.size());
 }
}