class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sum%2!=0) return false;
        Boolean [][] dp = new Boolean [nums.length][sum/2+1];
        return helper(nums,0,sum/2,0,dp);
    }
    public boolean helper(int [] nums, int currSum, int target, int idx, Boolean [][]dp){
        if(currSum == target) return true;
        if(currSum > target) return false;
        if(idx==nums.length) return false;
        if(dp[idx][currSum]!=null) return dp[idx][currSum];
        return  dp[idx][currSum] = helper(nums,currSum+nums[idx],target,idx+1,dp) || helper(nums,currSum,target,idx+1,dp);

    }
}