class Solution {
    public int solve(int[] arr , int ind ,  int[]dp){
        if(ind<0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int nottake = 0+solve(arr,ind-1 , dp);
        int take = arr[ind] + solve(arr,ind-2 , dp);
        return  dp[ind] = Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        int[]dp = new int[nums.length];
        Arrays.fill(dp , -1);
        int ans = solve(nums,nums.length-1 , dp);
        return ans;
    }
}