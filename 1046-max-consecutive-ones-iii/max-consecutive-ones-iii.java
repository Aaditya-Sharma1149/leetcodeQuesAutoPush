class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans =0;
        int l=0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==0){
                k--;
            }
            if(k==0){
                ans = Math.max(ans,r-l+1);
            }
            while(k<0){
                if(nums[l]==0){
                    k++;
                }
                l++;
            }
        }
        if(ans==0 && k!=0) return nums.length;
        return ans;
    }
}