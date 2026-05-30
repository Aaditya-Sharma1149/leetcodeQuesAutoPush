class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE; 
        while( j<nums.length){
            sum = sum + nums[j];
            j++;
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum = 0;
                i=j;
            }
        }
        return maxSum;
    }
}