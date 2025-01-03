class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans = 0;
        long totalSum = 0;
        long prefixSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            prefixSum += nums[i];
            long suffixSum = totalSum - prefixSum;

            if (prefixSum >= suffixSum) {
                ans++;
            }
        }

        return ans;
    }
}
