class Solution {
    public int removeElement(int[] nums, int val) {
        if(val>50){
            return nums.length;
        }
        int j = nums.length-1;
        while(j>=0 && nums[j]==val){
            j--;
        }
        for(int i=0; i<=j; i++){
            if(nums[i]==val){
                swap(nums,i,j);
                while(nums[j]==val){
                    j--;
                }
            }
        }
        return j+1 ;

    }
    public void swap(int [] nums ,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}