class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            if(ans==0) return ans;
            if(Math.abs(ans)>Math.abs(nums[i])){
                ans=nums[i];
                continue;
            }
            if(Math.abs(ans)==Math.abs(nums[i])){
                ans = Math.max(ans,nums[i]);
            }
        }
        return ans;
    }
}