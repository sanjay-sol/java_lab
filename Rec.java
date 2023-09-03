public class Rec {
    static void print(int n){
        if(n==3){
            System.out.println(n);
            return;

        }
            // return;
            print(n + 1 );
            print(n + 1 );
            System.out.println(n);
    }
    public static void main(String[] args) {
        print(1);
    }

}
