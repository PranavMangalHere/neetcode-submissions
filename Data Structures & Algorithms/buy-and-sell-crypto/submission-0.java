class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minprice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(minprice > prices[i]){
                minprice = prices[i];
            }
            maxProfit = Math.max(maxProfit,prices[i] - minprice);
        }
        return maxProfit;

    }
}
