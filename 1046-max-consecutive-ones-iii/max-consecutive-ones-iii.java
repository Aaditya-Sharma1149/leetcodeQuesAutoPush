class Solution {
    public int longestOnes(int[] nums, int k) {
        int r=0;
        int l=0;
        int z=0;
        int ans=0;

        while(r<nums.length){
            if(nums[r]==0){
                z++;
            }
            if(z>k){
                ans = Math.max(ans,r-l);
                while(z>k){
                    if(nums[l]==0){
                        z--;
                    }
                    l++;
                }
            }
            r++;
        }
        ans = Math.max(ans,r-l);
        return ans;
    }
}