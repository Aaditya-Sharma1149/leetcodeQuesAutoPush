class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        for(int i=0; i<prices.length-1; i++){
            int slope = prices[i+1]-prices[i];
            if( slope > 0){
                ans = ans + slope;;
            }
        }
        return ans;
    }
}