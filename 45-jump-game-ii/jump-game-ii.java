class Solution {
    public int jump(int[] nums) {

        if (nums.length==1) return 0;
        
        int [] dp = new int[nums.length];
        for(int i=0; i<dp.length; i++){
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;

        for(int i=0; i<nums.length; i++){ 
            for(int j=i; j<nums.length && j<=i+nums[i]; j++){
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }
        return dp[nums.length-1];
    }
}