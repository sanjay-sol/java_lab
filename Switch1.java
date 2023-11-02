import java.util.Scanner;
class Switch1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mango or apple");
        String fruits = sc.next();
        switch (fruits)
        {
            case "mango" -> System.out.println("mango is good");
            case "apple" -> System.out.println("apple is good");
            default -> System.out.println("enter a valid fruit name");
        }
    }
}


























