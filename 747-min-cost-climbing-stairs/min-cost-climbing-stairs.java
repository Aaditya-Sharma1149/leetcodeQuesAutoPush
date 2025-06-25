class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==0) return 0;
        if(cost.length==1) return 0;
        int [] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,cost.length-2,dp), helper(cost,cost.length-1,dp)); 
    }
    public int helper(int [] cost , int i, int [] dp){
        if(i<0){
             return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int step = cost[i] + helper(cost,i-1,dp);
        int jump = cost[i] + helper(cost,i-2,dp);
        return dp[i] = Math.min(step,jump);
    }
}