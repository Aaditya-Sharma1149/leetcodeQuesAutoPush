class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int l=-2;
        int ans=0;

        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i]==1){
                ans=ans+(i-l-2)/2;
                if(ans>=n){
                    return true;
                }
                l=i;
            }
        }
        ans=ans+ (flowerbed.length-l-1)/2;
        if(ans>=n) return true;
        return false;
    }
}