class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int ans = Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length){
            sum = sum + nums[r];
            if(sum>=target){
                while(sum>=target && l<=r){
                    ans = Math.min(ans,r-l+1);
                    sum=sum-nums[l];
                    l++;
                }
            }
            r++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}