class Solution {
    public int coinChange(int[] coins, int amount) {
        int [][] dp = new int [amount+1][coins.length];
        for(int i=0; i < dp.length; i++){
            for(int j=0; j < dp[0].length; j++){
                dp[i][j]=-1;
            }
        }
        int ans = helper(coins,amount,0, dp);
        return ans==Integer.MAX_VALUE ? -1: ans;
    }
    public int helper(int [] coins, int amount, int index, int [][] dp){
        if(amount == 0 ) return 0;
        if(amount < 0 ) return Integer.MAX_VALUE;
        if(index==coins.length) return Integer.MAX_VALUE;
        if(dp[amount][index]!=-1) return dp[amount][index];
        int take =  helper( coins, amount - coins[index], index, dp);
        if(take!= Integer.MAX_VALUE) take+=1;
        int skip = helper( coins, amount, index+1, dp);

        return dp[amount][index] = Math.min( take,skip);
    }
}