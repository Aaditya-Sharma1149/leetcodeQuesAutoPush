class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        int l = 0;
        int r = nums.length-1;
        int mid;
        while(l<=r){
            mid = (r-l)/2 + l;

            if(nums[mid]!=nums[mid+1] && nums[mid-1]!=nums[mid]) return nums[mid];

            if(mid%2==0){
                if( nums[mid]!=nums[mid+1]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return 0;
    }
}