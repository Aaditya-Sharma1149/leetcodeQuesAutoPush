class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, maxSum = 0;
        int l = 0;
        boolean[] seen = new boolean[100001];

        for (int r = 0; r < nums.length; r++) {
            // If nums[right] is not in the window
            if (!seen[nums[r]]) {
                sum += nums[r];
                seen[nums[r]] = true; // Mark it as seen

                // If the window size equals k
                if (r - l + 1 == k) {
                    maxSum = Math.max(maxSum, sum);
                    // keep the window lower than K
                    seen[nums[l]] = false;
                    sum -= nums[l];
                    ++l;
                }
            } else {
                // If nums[right] is a duplicate, move left pointer until nums[right] is excluded
                while (nums[l] != nums[r]) {
                    sum -= nums[l];
                    seen[nums[l]] = false;
                    ++l;
                }
                ++l; // Skip the duplicate element itself
            }
        }

        return maxSum;


    }
}