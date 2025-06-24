class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            int ans = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if( ans == nums[j] ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
}