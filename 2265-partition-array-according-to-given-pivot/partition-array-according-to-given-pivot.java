class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int idx = 0; int left=0; int right = nums.length-1;
        int [] ans = new int[nums.length];
        while(nums[idx] != pivot){
            idx++;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                ans[left] = nums[i];
                left++;
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]>pivot){
                ans[right] = nums[i];
                right--;
            }
        }
        for(int i=left; i<=right; i++){
            ans[i]=pivot;
        }
        return ans;
        
    }
}