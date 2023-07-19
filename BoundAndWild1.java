import java.util.*;
public class BoundAndWild1
{
    public static <T extends Number> double Sum(List<T> number)
    {
        double sum = 0.0;
        for (T num : number)
            sum += num.doubleValue();
        return sum;
    }
    public static void printlist(List<?> list)
   {
        for (Object ele : list)
            System.out.println(ele + " ");
        System.out.println();
    }
    public static void main(String[] args)
   {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(Sum(l));
        ArrayList<Double> d = new ArrayList<>();
        d.add(10.2);
        d.add(11.2);
        System.out.println(Sum(d));
        ArrayList<String> s = new ArrayList<>();
        s.add("HI");
        s.add("Hey");
        printlist(s);
} }