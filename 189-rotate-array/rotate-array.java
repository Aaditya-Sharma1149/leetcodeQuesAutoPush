class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0) return;
        reverse(nums,0,nums.length);
        reverse(nums,k,nums.length);
        reverse(nums,0,k);
    }
    public void reverse( int [] nums , int i, int n){
        int temp;
        for( int j=0; j<(n-i)/2; j++){
            temp = nums[i+j];
            nums[i+j]=nums[n-j-1];
            nums[n-j-1]=temp;
        }
    }
}