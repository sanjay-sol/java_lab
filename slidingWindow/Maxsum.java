package slidingWindow;

public class Maxsum {
     static int maxsum(int arr[] , int k){
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;
        for (int i = 0 ; i < k ; i++ ){
            wSum += arr[i];
        }
        for ( int i = k ; i < arr.length ; i++){
            wSum = wSum - arr[i-k] + arr[k];
            mSum = Math.max(mSum, wSum);
        }
        return mSum;
    }
    public static void main(String[] args) {
        int[] arr = {2 , 9, 31 , -4 , 21 , 7};
        int k = 3;
        System.out.println(maxsum(arr, k));

    }
 
}
