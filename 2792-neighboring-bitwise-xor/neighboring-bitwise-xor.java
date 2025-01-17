class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans = 0;
        for(int i: derived){
            ans=ans^i;
        }
        if(ans==0){
            return true;
        }
        return false;
    }
}