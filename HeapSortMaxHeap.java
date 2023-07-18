import java.util.*;

public class HeapSort {
    private PriorityQueue<Integer> pq;
    public static ArrayList<Integer> l = new ArrayList<Integer>();

    public HeapSort() {
        pq = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void enqueue(int value) {
        pq.add(value);
    }

    public void dequeue() {
        while (!pq.isEmpty()) {
            l.add(pq.remove());
        }
        System.out.println("sorted heap=" + l);
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeapSort obj = new HeapSort();
        System.out.println("enter no.of elemnets to insert");
        int n = sc.nextInt();
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            obj.enqueue(sc.nextInt());
        }
        obj.dequeue();
    }
}