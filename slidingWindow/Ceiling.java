package slidingWindow;

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
    return start;
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,10};
        int target = 7;
        System.out.println(search(arr, target));
    }
}

