import java.util.*;
public class Qal<T> {
    private ArrayList<T> qu = new ArrayList<>();

    public void push(T item) {
        qu.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Q is empty");
        } else {
            return qu.remove(0);
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Q is empty");
        } else {
            return qu.get(0);
        }
    }

    public void display() {
        if (isEmpty()) {
            throw new RuntimeException("Q is empty");
        } else {
            for (int i = 0; i < qu.size() ; i++) {
                System.out.println(qu.get(i) + " ");
            }
        }
    }

    public boolean isEmpty() {
        return qu.size() == 0;
    }

    public int size() {
        return qu.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data type to chooose 1.Int 2.Float 3.String");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Qal<Integer> q = new Qal<Integer>();
                while (true) {
                    System.out.println("Choose operation 1.Push 2.POp 3.peek 4.display 5.size");
                    int ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter no of ele to push");
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++) {
                                q.push(sc.nextInt());
                            }
                            break;
                        case 2:
                            q.pop();
                            break;
                        case 3:
                            q.peek();
                            break;
                        case 4:
                            q.display();
                            break;
                        default:
                            return;
                    }
                }
            case 2:
                Qal<Float> q1 = new Qal<Float>();
                while (true) {
                    System.out.println("Choose operation 1.Push 2.POp 3.peek 4.display 5.size");
                    int ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter no of ele to push");
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++) {
                                q1.push(sc.nextFloat());
                            }
                            break;
                        case 2:
                            q1.pop();
                            break;
                        case 3:
                            q1.peek();
                            break;
                        case 4:
                            q1.display();
                            break;
                        default:
                            return;
                    }
                }
            case 3:
                Qal<String> q3 = new Qal<String>();
                while (true) {
                    System.out.println("Choose operation 1.Push 2.POp 3.peek 4.display 5.size");
                    int ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter no of ele to push");
                            int n = sc.nextInt();
                            for (int i = 0; i < n; i++) {
                                q3.push(sc.next());
                            }
                            break;
                        case 2:
                            System.out.println("Poped"+q3.pop());
                            break;
                        case 3:
                            System.out.println("peeled"+q3.peek());
                            break;
                        case 4:
                            q3.display();
                            break;
                        default:
                            return;
                    }
                }
        }

    }

}
