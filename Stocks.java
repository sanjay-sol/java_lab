import java.util.*;
public class Stocks {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,1};
        System.out.println(findIndex(arr,0));

    }
   static int findIndex(int[] arr , int k){
        for(int i = arr.length - 1; i >= 0 ; i --){
            if(arr[i] == k){
                return i;
            }
            
        }
        return -1;
    }

    // public static int maxProfit(int[] prices) {
    //     int first = 0;
    //     int last = prices.length - 1;
    //     ArrayList<Integer> al = new ArrayList<Integer>();
    //     while(first!=prices.length){
    //         if(prices[first] > prices[last] ){
    //             first++;
    //         }else{
    //             if(first < last){
    //                 al.add(prices[last]-prices[first]);
    //                 last--;
    //             }else{
    //                 first++;
    //                 last=prices.length-1;
    //             }
    //         }
    //     }
    //     if(al.size() == 0){
    //         return 0;
    //     }else{

    //         return Collections.max(al);
    //     }

        

    // }
}

