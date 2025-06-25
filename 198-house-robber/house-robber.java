class Solution {
    public int rob(int[] nums) {
        int [] dp = new int [nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
    public int helper(int[] nums, int i, int [] dp){
        if(i>nums.length-1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int taken = nums[i] + helper(nums,i+2,dp);
        int nottaken = helper(nums,i+1,dp);
        return dp[i] = Math.max(taken,nottaken);
    }
}