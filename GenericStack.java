import java.util.*;
class ArrayStack<T> {
 private T[] items;
 private int top;
 public ArrayStack(int size) {
 items = (T[]) new Object[size];
 top = -1;
 }
 public void push(T ele) {
 if (top == items.length - 1)
 System.out.println("Stack is Full..");
 else
 items[++top] = ele;
 }
 public T pop() {
 if (isEmpty()) {
 System.out.println("Stack is Empty..");
 return null;
 } else
 return items[top--];
 }
 public T peek() {
 if (isEmpty()) {
 System.out.println("Stack is Empty..");
 return null;
 } else
 return items[top];
 }
 public void display() {
 if (isEmpty())
 System.out.println("Stack is Empty..");
 else {
 int i;
 for (i = top; i >= 0; i--)
 System.out.println(items[i]);
 }
 }
 public boolean isEmpty() {
    return top == -1;
 }
 public int size() {
 return top + 1;
 }
}
class LinkedStack<T> {
 private Node<T> top;
 private int size;
 public static class Node<T> {
    private T data;
 public Node<T> next;
 public Node(T data) {
 this.data = data;
 this.next = null;
 }
 }
 public LinkedStack() {
 top = null;
 size = 0;
 }
 public void push(T ele) {
 Node<T> n = new Node<T>(ele);
 n.next = top;
 top = n;
 size++;
 }
 public T pop() {
 if (isEmpty()) {
 System.out.println("Stack is Empty..");
 return null;
 } else {
 T item = top.data;
 top = top.next;
 size--;
 return item;
 }
 }
 public T peek() {
 if (isEmpty()) {
 System.out.println("Stack is Empty..");
 return null;
 } else {
 return top.data;
 }
 }
 public void display() {
 if (isEmpty())
 System.out.println("Stack is Empty..");
 else {
 Node<T> current = top;
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
public class GenStack3a {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter choice:");
    System.out.println("1.ArrayList\n2.LinkedList\n3.Exit");
    int ch = sc.nextInt();
    switch (ch) {
    case 1:
    System.out.println("Choose the data type on which you want to
   perform operation:");
    System.out.println("1.Integer\n2.Float\n3.String");
    int datatype = sc.nextInt();
    switch (datatype) {
    case 1:
    ArrayStack<Integer> a = new ArrayStack<Integer>(10);
    while (true) {
    System.out.println("Enter Operation to perform on
   stack:");
    System.out.println("1.Push\n2.Pop\n3.Peek\
   n4.Display\n5.Size");
    int ch1 = sc.nextInt();
    switch (ch1) {
    case 1:
    System.out.println("Enter no:of elements to
   push into a stack:");
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
 ArrayStack<Float> f = new ArrayStack<Float>(10);
 while (true) {
 System.out.println("Enter Operation to perform on
stack:");
 System.out.println("1.Push\n2.Pop\n3.Peek\
n4.Display\n5.Size");
 int ch2 = sc.nextInt();
 switch (ch2) {
 case 1:
 System.out.println("Enter no:of elements to
push into a stack:");
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
 System.out.println("Elements in stack
are:");
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
 System.out.println("Enter Operation to perform on
stack:");
 System.out.println("1.Push\n2.Pop\n3.Peek\
n4.Display\n5.Size");
 int ch3 = sc.nextInt();
 switch (ch3) {
 case 1:
 System.out.println("Enter no:of elements to
push into a stack:");
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
 System.out.println("Elements in stack
are:");
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
 System.out.println("Choose the data type on which you want to
perform operation:");
 System.out.println("1.Integer\n2.Float\n3.String");
 int datatypel = sc.nextInt();
 switch (datatypel) {
 case 1:
 LinkedStack<Integer> l = new LinkedStack<Integer>();
 while (true) {
 System.out.println("Enter Operation to perform on
stack:");
 System.out.println("1.Push\n2.Pop\n3.Peek\
n4.Display\n5.Size");
 int ch1 = sc.nextInt();
 switch (ch1) {
 case 1:
 System.out.println("Enter no:of elements to
push into a stack:");
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
 System.out.println("Elements in stack
are:");
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
 LinkedStack<Float> f = new LinkedStack<Float>();
 while (true) {
    System.out.println("Enter Operation to perform on
   stack:");
    System.out.println("1.Push\n2.Pop\n3.Peek\
   n4.Display\n5.Size");
    int ch2 = sc.nextInt();
    switch (ch2) {
    case 1:
    System.out.println("Enter no:of elements to push into a stack:");
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
 System.out.println("Elements in stack
are:");
 f.display();
 break;
 case 5:
 System.out.println("Size:" + f.size());
 default:
 return;
 }
 }
 case 3:
 LinkedStack<String> s = new LinkedStack<String>();
 while (true) {
 System.out.println("Enter Operation to perform on
stack:");
 System.out.println("1.Push\n2.Pop\n3.Peek\
n4.Display\n5.Size");
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
 System.out.println("Peeked element:" + s.peek());
 break;
 case 4:
 System.out.println("Elements in stack
are:");
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