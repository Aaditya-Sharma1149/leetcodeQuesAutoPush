class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int product = nums[i];
            if(nums[i]>=k) continue;
            ans++;
            for(int j=i+1; j<nums.length; j++){
                product *= nums[j];
                if(product>=k) break;
                ans++;
            }
        }
        return ans;
    }
}