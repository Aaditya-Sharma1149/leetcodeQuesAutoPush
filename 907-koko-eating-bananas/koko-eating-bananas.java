class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // k -> maximum -> all bananas;
        if(piles.length == 1){
            if(piles[0]%h==0) return piles[0]/h;
            return piles[0]/h + 1;
        }
        int left = 1;
        int right = 0;
        int mid = 0;
        for(int i=0; i<piles.length; i++){
            right = Math.max(piles[i],right);
        }
        while(left<=right){
            mid = left + (right-left)/2;
            System.out.print("mid = " + mid);
            int time = time(piles,mid);
            if(time<=h){
                right = mid-1;
            }
            else if(time>h){
                left = mid + 1;
            }    
        }
        return left;
    }
    public int time(int [] nums, int k){
        if(k==0) return Integer.MAX_VALUE;
        int time = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%k==0) time += nums[i]/k;
            else time = nums[i]/k + time + 1;
        }
        System.out.println("time = " + time);
        if(time<0) return Integer.MAX_VALUE;
        return time;
    }
}