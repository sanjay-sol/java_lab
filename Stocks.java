import java.util.*;
public class Stocks {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int first = 0;
        int last = prices.length - 1;
        ArrayList<Integer> al = new ArrayList<>();
        while(first!=prices.length){
            if(prices[first] > prices[last] ){
                first++;
            }else{
                if(first < last){
                    al.add(prices[last]-prices[first]);
                    last--;
                }else{
                    first++;
                    last=prices.length-1;
                }
            }
        }
        if(al.size() == 0){
            return 0;
        }else{

            return Collections.max(al);
        }

        

    }
}

