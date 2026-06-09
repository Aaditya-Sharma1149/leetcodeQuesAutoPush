class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int idx = -1;
        for(int i = 0; i<numbers.length; i++){
            idx = binarySearch(numbers,target-numbers[i],i+1);
            if(idx!=-1){
                return new int[]{i+1,idx+1};
            }
        }
        return new int[]{-1,-1};

    }
    public int binarySearch(int [] numbers, int target, int l){
        int r = numbers.length-1;
        int mid = -1;
        while(l<=r){
            mid = (r - l)/2 + l;
            if(numbers[mid]==target){
                return mid;
            }
            if(numbers[mid]>target){
                r = mid-1;
            }
            if(numbers[mid]<target){
                l = mid+1;
            }
        }
        return -1;
    }
}