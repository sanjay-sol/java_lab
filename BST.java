import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    private Node insertRecursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRecursive(root.left, key);
        else if (key > root.key)
            root.right = insertRecursive(root.right, key);
        return root;
    }

    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (key < root.key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    Node delNode(Node root, int key) {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = delNode(root.left, key);
        else if (key > root.key)
            root.right = delNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            Node minValueNode = minValueNode(root.right);
            root.key = minValueNode.key;
            root.right = delNode(root.right, minValueNode.key);
        }
        return root;
    }

    Node minValueNode(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node root) {
        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.key + " ");
            inOrderRecursive(root.right);
        }
    }

    public void preOrderTraversal() {
        preOrderRecursive(root);
    }

    private void preOrderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    public void postOrderTraversal() {
        postOrderRecursive(root);
    }

    private void postOrderRecursive(Node root) {
        if (root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.key + " ");
        }
    }
}

public class MainBST {
    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:of elements:");
        int n = sc.nextInt();
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            bst.insert(sc.nextInt());
        }
        System.out.println("Element to Search:");
        int eleS = sc.nextInt();
        Node find = bst.search(bst.root, eleS);
        if (find != null)
            System.out.println("Element" + eleS + " found");
        else
            System.out.println("Element" + eleS + " not found");
        System.out.println("Enter element to delete:");
        int eleD = sc.nextInt();
        bst.root = bst.delNode(bst.root, eleD);
        System.out.print("In-order traversal: ");
        bst.inOrderTraversal();
        System.out.print("\nPre-order traversal: ");
        bst.preOrderTraversal();
        System.out.print("\nPost-order traversal: ");
        bst.postOrderTraversal();
    }
}