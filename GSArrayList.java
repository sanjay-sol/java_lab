import java.util.*;
import java.lang.*;

class ArrGen<T> {
    private ArrayList<T> stack;

    public ArrGen() {
        stack = new ArrayList<T>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty..");
            return null;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Empty..");
            return null;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public void display() {
        if (isEmpty())
            throw new RuntimeException("Empty..");
        else {
            for (int i = stack.size() - 1; i >= 0; i--)
                System.out.println(stack.get(i));
        }
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }
}

public class CollectionDemo4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the data type on which you want to perform operation:");

        System.out.println("1.Integer\n2.Float\n3.String");
        int datatype = sc.nextInt();
        switch (datatype) {
            case 1:
                ArrayStack<Integer> a = new ArrayStack<Integer>(10);
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
                ArrayStack<Float> f = new ArrayStack<Float>(10);
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
                ArrayStack<String> s = new ArrayStack<String>(10);
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