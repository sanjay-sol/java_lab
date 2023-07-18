import java.util.*;

class LinkedQ<T> {
    private LinkedList<T> q;

    public LinkedQ() {
        q = new LinkedList<T>();
    }

    public void push(T item) {
        q.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty..");
            return null;
        } else {
            return q.removeLast();
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty..");
            return null;
        } else {
            return q.getLast();
        }
    }

    public void display() {
        if (isEmpty())
            throw new RuntimeException("Empty..");
        else {
            for (int i = q.size() - 1; i >= 0; i--)
                System.out.println(q.get(i));
        }
    }

    public boolean isEmpty() {
        return q.size() == 0;
    }

    public int size() {
        return q.size();
    }
}

public class CollectionQL5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice:");
        System.out.println("Choose the data type on which you want to performoperation:");
        System.out.println("1.Integer\n2.Float\n3.String");
        int datatypel = sc.nextInt();
        switch (datatypel) {
            case 1:
                LinkedQ<Integer> l = new LinkedQ<Integer>();
                while (true) {
                    System.out.println("Enter Operation to perform on stack:");
                    System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                    int ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter no:of elements to pushinto a stack:");
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++)
                                l.push(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("Popped Element:" + l.pop());
                            break;
                        case 3:
                            System.out.println("Peeked element:" + l.peek());
                            break;
                        case 4:
                            System.out.println("Elements in stack are:");
                            l.display();
                            break;
                        case 5:
                            System.out.println("Size:" + l.size());
                            break;
                        default:
                            return;
                    }
                }
            case 2:
                LinkedQ<Float> f = new LinkedQ<Float>();
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
                        default:
                            return;
                    }
                }
            case 3:
                LinkedQ<String> s = new LinkedQ<String>();
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
                            break;
                        default:
                            return;
                    }
                }
        }
    }
}