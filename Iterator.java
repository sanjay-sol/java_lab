import java.util.*;
public class IteratorDemo2
{
    public static void main(String[] args)
    {
        ArrayList<String> s = new ArrayList<>();
        s.add("Hello");
        s.add("hi");
        Iterator<String> a = s.iterator();
        while (a.hasNext())
        {
            System.out.println(a.next());
        }
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Hey");
        ll.add("there");
        Iterator<String> l = ll.iterator();
        while (l.hasNext())
        {
            System.out.println(l.next());
} }
}