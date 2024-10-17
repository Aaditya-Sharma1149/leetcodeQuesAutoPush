class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int ans=-1;
        while(l<r){
            int temp = water(l,r,height);
            if(ans<temp){
                ans = temp;
            }
            if ( height[l]<height[r] ){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
    public int water(int l, int r, int [] height){
        return Math.min(height[l],height[r]) * (r-l);
    }
}