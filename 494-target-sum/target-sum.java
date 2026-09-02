class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int [][] dp = new int [target+40000][nums.length];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums,target+20000,0,dp);
    }
    public int helper(int [] nums, int sum, int index, int [][] dp){
        if(index==nums.length){
            if(sum==20000) return 1;
            return 0;
        }
        if(dp[sum][index]!=-1) return dp[sum][index];
        return dp[sum][index] = helper(nums,sum-nums[index],index+1,dp) + helper(nums,sum+nums[index],index+1,dp);
    }
}