import java.util.Scanner;
class Test1
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number");
          int num = sc.nextInt();
       int count=0;
       while(num>0){
        int rem =num%10;
        if (rem==5){
            count++;
        }
        num=num/10;
       }
       System.out.println(count);
        
    }
}