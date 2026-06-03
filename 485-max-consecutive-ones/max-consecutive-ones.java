class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int ans = 0;
        while(j<nums.length){
            if(nums[j]==1){
                j++;
                continue;
            }
            if(nums[j]==0){
                ans = Math.max(ans,j-i);
                j++;
                i=j;
            }
        }
        ans = Math.max(ans,j-i);
        return ans;
    }
}