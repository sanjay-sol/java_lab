import java.util.*;

class ArrayQ<T> {
    private T[] items;
    private int rear, front;
    int size;

    public ArrayQ(int size) {
        items = (T[]) new Object[size];
        front = 0;
        rear = -1;
    }

    public void push(T item) {
        if (rear == items.length - 1) {
            System.out.println("Queue is Full..");
        } else {
            ++rear;
            items[rear] = item;
            size++;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty..");
            return null;
        } else {
            T temp = items[front];
            front++;
            size--;
            return temp;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty..");
            return null;
        } else
            return items[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty..");
        } else {
            for (int i = front; i <= rear; i++)
                System.out.println(items[i]);
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return rear + 1;
    }
}

class LinkedQ<T> {
    private Node<T> front, rear, newnode;
    private int size;

    public static class Node<T> {
        private T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedQ() {
        front = null;
        rear = null;
        size = 0;
    }

    public void push(T ele) {
        Node<T> n = new Node<T>(ele);
        if (isEmpty()) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
            size++;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty..");
            return null;
        } else {
            T temp = front.data;
            front = front.next;
            size--;
            return temp;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty..");
            return null;
        } else {
            return front.data;
        }
    }

    public void display() {
        if (isEmpty())
            System.out.println("Queue is Empty..");
        else {
            LinkedQ.Node<T> current;
            current = front;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class GenQueue3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice:");
        System.out.println("1.ArrayList\n2.LinkedList\n3.Exit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Choose the data type on which you want toperform operation:");
                System.out.println("1.Integer\n2.Float\n3.String");
                int datatype = sc.nextInt();
                switch (datatype) {
                    case 1:
                        ArrayQ<Integer> a = new ArrayQ<Integer>(10);
                        while (true) {
                            System.out.println("Enter Operation to perform onstack:");
                            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                            int ch1 = sc.nextInt();
                            switch (ch1) {
                                case 1:
                                    System.out.println("Enter no:of elements topush into a stack:");
                                    int n = sc.nextInt();
                                    for (int i = 0; i < n; i++)
                                        a.push(sc.nextInt());
                                    break;
                                case 2:
                                    System.out.println("Popped Element:" +
                                            a.pop());
                                    break;
                                case 3:
                                    System.out.println("Peeked element:" +
                                            a.peek());
                                    break;
                                case 4:
                                    System.out.println("Elements in stackare:");
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
                        ArrayQ<Float> f = new ArrayQ<Float>(10);
                        while (true) {
                            System.out.println("Enter Operation to perform onstack:");
                            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                            int ch2 = sc.nextInt();
                            switch (ch2) {
                                case 1:
                                    System.out.println("Enter no:of elements topush into a stack:");
                                    int n = sc.nextInt();
                                    for (int i = 0; i < n; i++)
                                        f.push(sc.nextFloat());
                                    break;
                                case 2:
                                    System.out.println("Popped Element:" +
                                            f.pop());
                                    break;
                                case 3:
                                    System.out.println("Peeked element:" +
                                            f.peek());
                                    break;
                                case 4:
                                    System.out.println("Elements in stackare:");
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
                        ArrayQ<String> s = new ArrayQ<String>(10);
                        while (true) {
                            System.out.println("Enter Operation to perform onstack:");
                            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                            int ch3 = sc.nextInt();
                            switch (ch3) {
                                case 1:
                                    System.out.println("Enter no:of elements topush into a stack:");
                                    int n = sc.nextInt();
                                    for (int i = 0; i < n; i++)
                                        s.push(sc.next());
                                    break;
                                case 2:
                                    System.out.println("Popped Element:" +
                                            s.pop());
                                    break;
                                case 3:
                                    System.out.println("Peeked element:" +
                                            s.peek());
                                    break;
                                case 4:
                                    System.out.println("Elements in stackare:");
                                    s.display();
                                    break;
                                case 5:
                                    System.out.println("Size:" + s.size());
                                default:
                                    return;
                            }
                        }
                }
            case 2:
                System.out.println("Choose the data type on which you want toperform operation:");
                System.out.println("1.Integer\n2.Float\n3.String");
                int datatypel = sc.nextInt();
                switch (datatypel) {
                    case 1:
                        LinkedQ<Integer> l = new LinkedQ<Integer>();
                        while (true) {
                            System.out.println("Enter Operation to perform onstack:");
                            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                            int ch1 = sc.nextInt();
                            switch (ch1) {
                                case 1:
                                    System.out.println("Enter no:of elements topush into a stack:");
                                    int n = sc.nextInt();
                                    for (int i = 0; i < n; i++)
                                        l.push(sc.nextInt());
                                    break;
                                case 2:
                                    System.out.println("Popped Element:" +
                                            l.pop());
                                    break;
                                case 3:
                                    System.out.println("Peeked element:" +
                                            l.peek());
                                    break;
                                case 4:
                                    System.out.println("Elements in stackare:");
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
                            System.out.println("Enter Operation to perform onstack:");
                            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                            int ch2 = sc.nextInt();
                            switch (ch2) {
                                case 1:
                                    System.out.println("Enter no:of elements topush into a stack:");
                                    int n = sc.nextInt();
                                    for (int i = 0; i < n; i++)
                                        f.push(sc.nextFloat());
                                    break;
                                case 2:
                                    System.out.println("Popped Element:" +
                                            f.pop());
                                    break;
                                case 3:
                                    System.out.println("Peeked element:" +
                                            f.peek());
                                    break;
                                case 4:
                                    System.out.println("Elements in stackare:");
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
                            System.out.println("Enter Operation to perform onack:");
                            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Size");
                            int ch3 = sc.nextInt();
                            switch (ch3) {
                                case 1:
                                    System.out.println("Enter no:of elements topush into a stack:");
                                    int n = sc.nextInt();
                                    for (int i = 0; i < n; i++)
                                        s.push(sc.next());
                                    break;
                                case 2:
                                    System.out.println("Popped Element:" +
                                            s.pop());
                                    break;
                                case 3:
                                    System.out.println("Peeked element:" +
                                            s.peek());
                                    break;
                                case 4:
                                    System.out.println("Elements in stackare:");
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
            default:
                break;
        }
    }
}