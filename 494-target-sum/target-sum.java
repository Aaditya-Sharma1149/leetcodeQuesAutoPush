class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0);
    }public int helper(int [] nums, int target, int idx){
        if(idx==nums.length){
            if(target==0) return 1;
            return 0;
        }
        return helper(nums, target-nums[idx], idx+1) + helper(nums, target+nums[idx], idx+1);
    }
}