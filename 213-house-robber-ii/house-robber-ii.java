class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(onerob(nums),tworob(nums));
    }
    public int onerob(int[] nums) {
        int [] dp = new int[nums.length];  
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for(int i=2; i<nums.length-1; i++){
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[nums.length-2];
    }
    public int tworob(int[] nums) {
        if(nums.length==2) return nums[1];
        int [] dp = new int[nums.length];  
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1],nums[2]);
        for(int i=3; i<nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[nums.length-1];
    }
    
}