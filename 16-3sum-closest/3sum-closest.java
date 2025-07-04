class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int close = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){

            if(i>0 && nums[i]==nums[i-1]) continue;

            int val = target - nums[i];
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                int sum = nums[l] + nums[r];
                if(close > Math.abs(val - sum )){
                    close = Math.abs(val - sum);
                    if(close==0) return target;
                    ans = sum + nums[i];
                }
                if(sum>val){
                    r--;
                }
                if(sum<val){
                    l++;
                }
            }
        }
        return ans;
    }
}