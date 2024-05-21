class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int mid=4;
        while(left<=right){
            mid = left + ( right-left )/2;
            if( arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }
            if ( arr[mid] > arr[mid+1] ){
                right=mid-1;
            }
            if( arr[mid] < arr[mid+1] ){
                left=mid+1;
            }
        }
        return mid;
    }
}