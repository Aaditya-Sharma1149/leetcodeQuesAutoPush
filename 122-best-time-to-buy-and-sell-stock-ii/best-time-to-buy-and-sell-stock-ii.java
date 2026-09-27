class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int profit = 0;
        int buy = 0;
        if(prices.length==1) return 0;
        while(i<prices.length-1){
            if(prices[i+1]>prices[i]){
                System.out.print("buy on day" + (i+1) + " " );
                buy = prices[i];
                while(i<prices.length-1 && prices[i+1]>prices[i]) i++;
                System.out.println("sell on day" + (i+1) + "  profit = " + (prices[i] - buy) );
                profit += prices[i] - buy;
            }
            i++;
        }
        // if(prices[prices.length-2]<prices[prices.length-1]){
        //     System.out.print("sell on day" + (prices.length) + "profit = " + (prices[prices.length-1] - buy) );
        //     profit += prices[prices.length-1] - buy;
        // }
        return profit;
    }
}