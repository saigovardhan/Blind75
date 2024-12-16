class Solution {
    public int maxProfit(int[] prices) {
       int smallest = Integer.MAX_VALUE;
       int max_profit = 0;
       for(int price : prices){
        if(price < smallest){
            smallest = price;
        }else{
            max_profit = Math.max(max_profit, (price-smallest));
        }
       }

       return max_profit;
    }
}