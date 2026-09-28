class Solution {
    public boolean canJump(int[] nums) {
        int reach = nums[0];
        for(int i=1; i<nums.length; i++){
            if(reach<i){
                
                return false;
            }
            reach = Math.max(i+nums[i],reach);

        }
        return reach>=nums.length-1;
    }
}