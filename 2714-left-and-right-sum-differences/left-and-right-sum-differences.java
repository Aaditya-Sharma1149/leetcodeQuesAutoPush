class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] ans = new int [nums.length];
        int currSum = 0;
        int prevSum = 0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            prevSum = currSum;
            currSum = nums[i] + currSum; 
            ans[i] = Math.abs( currSum + prevSum - sum);
        }
        return ans;
    }
}