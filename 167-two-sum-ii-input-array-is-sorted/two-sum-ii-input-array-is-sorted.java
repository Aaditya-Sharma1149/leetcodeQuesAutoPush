class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++){
            int j=binarySearch(numbers, target-numbers[i]);
            if(j!=-1){
                if(i==j){
                    return new int[]{i+1,i+2};
                }
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{0,0};
    }
    public int binarySearch(int [] numbers, int target){
        int l = 0;
        int r = numbers.length-1;
        int mid;
        while(l<=r){
            mid = (r-l)/2 + l;
            if(numbers[mid]==target){
                return mid;
            }
            else if(numbers[mid]>target){
                r=mid-1;
            }
            else if(numbers[mid]<target){
                l= mid+1; 
            }
        }
        return -1;
    }
}