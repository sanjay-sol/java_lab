import java.util.Arrays;

public class Xorunique {
    public static void main(String[] args) {
        int[] arr = { 2 ,2 , 4 , 1 ,3 , 6 ,6 , 9 , 4 , 1 , 3};
        System.out.println(xor(arr));
    }
    static int xor(int[] arr){
        int unique = 0;
        for(int i = 0 ; i < arr.length ; i++){
            unique = unique ^ arr[i];
            // System.out.println(Arrays.toString(arr));
        }
        return unique;
    }
}
