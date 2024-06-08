class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int mid = -1;
        while ( l<r){
            
            mid = l + (r-l)/2;
            if ( mid < nums.length && nums[mid] > nums[mid+1]){
                r = mid; 
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}