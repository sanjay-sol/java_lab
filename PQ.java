import java.util.*;

public class MaxHeapPriorityQueue {
    private PriorityQueue<Integer> pq;

    public MaxHeapPriorityQueue() {
        pq = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void enqueue(int value) {
        pq.add(value);
    }

    public int dequeue() {
        if (pq.isEmpty()) {
            System.out.println("priority queue is empty");
        }
        return pq.remove();
    }

    public void printHeap() {
        System.out.println(pq);
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MaxHeapPriorityQueue mp = new MaxHeapPriorityQueue();
        while (true) {
            System.out.println("1.Insert 2.Delete 3.Display 4.Exit\n");
            System.out.println("enter choice:\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter no of elements:");
                    int numElements = sc.nextInt();
                    System.out.println("enter elements:");
                    for (int i = 0; i < numElements; i++) {
                        int value = sc.nextInt();
                        mp.enqueue(value);
                    }
                    break;
                case 2:
                    System.out.println("deleted max element:" + mp.dequeue());
                    break;
                case 3:
                    System.out.println("elements in queue are:");
                    mp.printHeap();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("enter valid choice");
            }
        }
    }
}