class Solution {
    public int change(int amount, int[] coins) {
        int [][] dp = new int [amount+1][coins.length]; 
        for(int row=0; row<dp.length; row++){
            Arrays.fill(dp[row],-1);
        }

        return helper(amount,coins,0,0,dp);
    }
    public int helper(int amount, int [] coins, int sum, int i,int [][] dp){
        if(i==coins.length) return 0;
        if(sum>amount) return 0;
        if(dp[sum][i]!=-1) return dp[sum][i];
        if(sum==amount) return dp[sum][i] = 1;
        return dp[sum][i] = helper(amount,coins,sum+coins[i],i,dp) + helper(amount,coins,sum,i+1,dp); 
    }
}