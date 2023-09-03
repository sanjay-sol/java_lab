public class RecArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 , 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(search(arr, 0));
        // search(arr , 0);
    }
    static boolean search(int[] arr, int i){
        if(i == arr.length - 1 ){
            return true;
        }
        return arr[i] < arr[i+1] && search(arr, i + 1);
       
    }
}
