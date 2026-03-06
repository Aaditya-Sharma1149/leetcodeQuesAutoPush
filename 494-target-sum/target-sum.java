class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int n:nums){
            sum += Math.abs(n);
        }
        int [][] dp  = new int[nums.length][2*sum+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j]=-1;
            }
        }
        return helper(nums, target, 0,dp,sum);

    }public int helper(int [] nums, int target, int idx, int [][] dp, int sum){
        if(target<-1*sum || target>sum) return 0;
        if(idx==nums.length){
            if(target==0) return 1;
            return 0;
        }
        if(dp[idx][sum + target]!=-1){
            return dp[idx][sum + target];
        }
        return dp[idx][sum + target] = helper(nums, target-nums[idx], idx+1,dp, sum) + helper(nums, target+nums[idx], idx+1,dp,sum);
    }
}