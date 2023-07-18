import java.util.*;

class ArrayQ<T> {
    private ArrayList<T> queue;

    public ArrayQ() {
        queue = new ArrayList<T>();
    }

    public void push(T item) {
        queue.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty..");
            return null;
        } else {
            return queue.remove(0);
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty..");
            return null;
        } else {
            return queue.get(0);
        }
    }

    public void display() {
        if (isEmpty())
            throw new RuntimeException("Empty..");
        else {
            for (int i = 0; i < queue.size(); i++)
                System.out.println(queue.get(i));
        }
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public int size() {
        return queue.size();
    }
}

public class CollectionQA5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the data type on which you want to performoperation:");
        System.out.println("1.Integer\n2.Float\n3.String");
        int datatype = sc.nextInt();
        switch (datatype) {
            case 1:
                ArrayQ<Integer> a = new ArrayQ<Integer>();
                while (true) {
                    System.out.println("Enter Operation to perform on stack:");
                    System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                    int ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter no:of elements to pushinto a stack:");
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++)
                                a.push(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("Popped Element:" + a.pop());
                            break;
                        case 3:
                            System.out.println("Peeked element:" + a.peek());
                            break;
                        case 4:
                            System.out.println("Elements in stack are:");
                            a.display();
                            break;
                        case 5:
                            System.out.println("Size:" + a.size());
                            break;
                        default:
                            return;
                    }
                }
            case 2:
                ArrayQ<Float> f = new ArrayQ<Float>();
                while (true) {
                    System.out.println("Enter Operation to perform on stack:");
                    System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                    int ch2 = sc.nextInt();
                    switch (ch2) {
                        case 1:
                            System.out.println("Enter no:of elements to pushinto a stack:");
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++)
                                f.push(sc.nextFloat());
                            break;
                        case 2:
                            System.out.println("Popped Element:" + f.pop());
                            break;
                        case 3:
                            System.out.println("Peeked element:" + f.peek());
                            break;
                        case 4:
                            System.out.println("Elements in stack are:");
                            f.display();
                            break;
                        case 5:
                            System.out.println("Size:" + f.size());
                            break;
                        default:
                            return;
                    }
                }
            case 3:
                ArrayQ<String> s = new ArrayQ<String>();
                while (true) {
                    System.out.println("Enter Operation to perform on stack:");
                    System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                    int ch3 = sc.nextInt();
                    switch (ch3) {
                        case 1:
                            System.out.println("Enter no:of elements to pushinto a stack:");
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++)
                                s.push(sc.next());
                            break;
                        case 2:
                            System.out.println("Popped Element:" + s.pop());
                            break;
                        case 3:
                            System.out.println("Peeked element:" + s.peek());
                            break;
                        case 4:
                            System.out.println("Elements in stack are:");
                            s.display();
                            break;
                        case 5:
                            System.out.println("Size:" + s.size());
                        default:
                            return;
                    }
                }
        }
    }
}