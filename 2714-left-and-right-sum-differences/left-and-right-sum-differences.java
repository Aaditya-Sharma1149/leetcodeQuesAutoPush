class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] sum = new int [nums.length+1];
        sum[1] = nums[0];
        int [] ans = new int [nums.length];
        for(int i=2; i<=nums.length; i++){
            sum[i] = nums[i-1] + sum[i-1];
        }
        for(int i=0; i<nums.length; i++){
            ans[i] = Math.abs(sum[i]+sum[i+1] - sum[nums.length]);
        }
        return ans;
    }
}