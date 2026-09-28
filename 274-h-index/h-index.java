class Solution {
    public int hIndex(int[] citations) {
        int l = 0;
        int r = citations.length;
        if(r==1 && citations[0]==0) return 0;
        int ans = 0;
        while(l<=r){
            int mid = (r - l)/2 + l;
            if(helper(citations,mid)){
                l = mid + 1;
            }
            else{
                r = mid-1;
            }
        }
        return r; 

    }
    public boolean helper(int [] nums, int h){
        if(h==0) return true;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= h){
                count++;
                if(count>=h) return true;
            }
        }
        return count>=h;
    }

}