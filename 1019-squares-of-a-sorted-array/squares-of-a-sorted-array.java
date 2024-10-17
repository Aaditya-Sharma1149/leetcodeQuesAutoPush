class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums[0]>=0){         //all positive
            int i = 0;
            while(i<nums.length){
                nums[i]=nums[i]*nums[i];
                i++;
            }
            return nums;
        }
        if(nums[nums.length-1]<=0){     //all negative
            int j=0;
            while(j<nums.length){
                nums[j]*=nums[j];
                j++;
            }
            //reverse nums;
            for(int i=0;i<nums.length/2;i++){
                int temp=nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp;
            }
            return nums;
        }
        int idx=-1;
        for(int i=0; i<nums.length; i++){
            if (nums[i]>=0){
                idx=i;
                break;
            }
        }
        int [] ans = new int[nums.length];
        int l = idx-1;
        int r = idx;
        int j=0;
        while(l>=0 && r<nums.length){
            if(Math.abs(nums[l])>nums[r]){
                ans[j]=nums[r]*nums[r];
                r++;
            }
            else{
                ans[j]=nums[l]*nums[l];
                l--;
            }
            j++;
        }
        if(r<nums.length){
            while(r<nums.length){
                ans[j]=nums[r]*nums[r];
                j++;
                r++;
            }
        }
        else{
            while(l>=0){
                ans[j]=nums[l]*nums[l];
                j++;
                l--;
            }
        }

        return ans;

    }
}