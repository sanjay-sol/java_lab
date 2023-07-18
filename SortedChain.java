import java.util.Scanner;

class NodeClass {
    NodeClass next;
    int data;

    NodeClass(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedChainLinkedList {
    NodeClass head;

    public SortedChainLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        NodeClass newNode = new NodeClass(data);
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            NodeClass current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        NodeClass temp = head;
        System.out.println("The Elements are: ");
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class SortedChainDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedChainLinkedList list = new SortedChainLinkedList();
        System.out.println("Enter no:of elements to insert:");
        int n = sc.nextInt();
        System.out.println("Enter The Element You wanted To insert: ");
        int el = sc.nextInt();
        list.insert(el);
        System.out.println("Elements are:");
        list.display();
    }
}