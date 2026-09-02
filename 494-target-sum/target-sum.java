class Solution {
    int totalSum;
    public int findTargetSumWays(int[] nums, int target) {
        for(int n:nums){
            totalSum += Math.abs(n);
        }

        int [][] dp = new int [nums.length][totalSum*2+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums,0,0,target,dp);
    }
    public int helper(int [] nums, int sum, int index,int target, int [][] dp){
        if(index==nums.length){
            if(sum==target) return 1;
            return 0;
        }
        if(dp[index][totalSum + sum]!=-1) return dp[index][sum + totalSum];
        return dp[index][sum +totalSum] = helper(nums,sum-nums[index],index+1,target,dp) + helper(nums,sum+nums[index],index+1,target,dp);
    }
}