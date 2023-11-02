// package slidingWindow;

public class Ceiling {
    static int search(int[] arr , int target){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){    
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
    }
    return end;
}
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,21,33,42,55,77,88,99,101};
        int target = -1 ;
        int ans = search(arr, target);
        System.out.println((arr.length-1)/2);
        System.out.println(arr[ans]);
    }
}

