class Solution {
    public boolean canPartition(int[] nums) {
        int sum = sum(nums);
        if(sum%2!=0) return false;
        sum = sum/2;
        boolean [][] dp = new boolean [nums.length+1][sum+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = true;
            }
        }
        return helper(nums,sum,0,dp);

    }public int sum(int [] nums){
        int sum = 0;
        for(int n:nums){
            sum += n;
        }
        return sum;
    }
    public boolean helper(int [] nums, int target, int idx, boolean [][] dp){
        if(idx==nums.length) return false;
        if ( target<0 ) return false;
        if(dp[idx][target] == false) return false;
        if ( target==0 ) return true;
        return dp[idx][target] = helper(nums, target-nums[idx], idx+1,dp) || helper(nums, target, idx+1,dp);
    }
}