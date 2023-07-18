import java.util.*;
public class LinkedHash6b {
 public static void main(String[] args) {
 HashSet<Integer> set = new HashSet<Integer>();
 set.add(1);
 set.add(2);
 set.add(0);
 set.add(0);
 System.out.println("Checking 1 is present in set:" + set.contains(1));
 System.out.println("Elements in set:" + set);
 set.remove(1);
 System.out.println("Checking 1 is present in set:" + set.contains(1));
 System.out.println("Elements in set:" + set);
 System.out.println("Size:" + set.size());
 Iterator<Integer> h = set.iterator();
 while (h.hasNext())
 System.out.println(h.next());
 System.out.println("Empty or not:" + set.isEmpty());
 set.clear();
 System.out.println("Empty or not:" + set.isEmpty());
 }
}