class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int i = 0;
        while ( i<=nums.length-1){
            while(nums[i]==0){
                if (i==nums.length-1){
                    break;
                }
                count++;
                i++;
            }
            nums[i-count] = nums[i];
            i++;
        }
        for( i = nums.length - count; i<nums.length; i++ ){
            nums[i]=0;
        }
    }
}