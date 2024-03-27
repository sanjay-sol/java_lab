
import java.util.*;
class SumSubSet {
    public static void main(String[] args) {
        int[] arr = {8,4,10,-7,17};
        int N = arr.length;
        int k = 22;
         ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
           ArrayList<Integer> currset = new ArrayList<>();
         
        
     subSet(arr,N,k,0,0,currset,subsets);
        System.out.print(subsets);
    }
    private static void subSet(int[] arr, int N, int K, int idx, int sum,ArrayList<Integer> currset,  ArrayList<ArrayList<Integer>> subsets){
        if (sum == K) {
            subsets.add(new ArrayList<>(currset));
            return;
        }
        if (sum > K || idx == N) {
            return;
        }
        
        currset.add(arr[idx]);
       subSet(arr,N,K,idx,sum+arr[idx],currset,subsets);
       currset.remove(currset.size()-1);
         subSet(arr,N,K,idx+1,sum,currset,subsets);
    }
}