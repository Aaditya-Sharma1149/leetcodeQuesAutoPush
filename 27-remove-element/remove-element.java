class Solution {
    public int removeElement(int[] nums, int val) {
        int i = nums.length-1;
        int j = nums.length-1;
        while(i>=0){
            if(nums[i]==val){
                nums[i] = nums[j];
                j--;
                
            }
            i--;
        }
        return j+1;
    }
}