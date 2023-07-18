import java.util.*;

public class AVLtree {
    TreeSet<Integer> t = new TreeSet<Integer>();

    public void insert(int ele) {
        t.add(ele);
    }

    public void delete(int ele) {
        if (t.contains(ele)) {
            t.remove(ele);
        } else {
            System.out.println("ELement not found..");
        }
    }

    public void search(int ele) {
        if (t.contains(ele)) {
            System.out.println("Element Found..");
        } else {
            System.out.println("ELement not found..");
        }
    }

    public void display() {
        System.out.println(t);
    }

    public static void main(String[] args) {
        AVLtree a = new AVLtree();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Insert\n2.Delete\n3.Search\n4.Display\n5.Exit");
        while (true) {
            System.out.println("Enter Choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element to insert:");
                    int eleI = sc.nextInt();
                    a.insert(eleI);
                    break;
                case 2:
                    System.out.println("Enter element to delete:");
                    int eleD = sc.nextInt();
                    a.delete(eleD);
                    break;
                case 3:
                    System.out.println("Enter element to Search:");
                    int eleS = sc.nextInt();
                    a.search(eleS);
                    break;
                case 4:
                    System.out.println("Elements in Tree are:");
                    a.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice..");
            }
        }
    }
}