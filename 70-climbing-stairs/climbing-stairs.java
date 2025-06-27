class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int penultimate  = 1;
        int curr = 0;
        for(int i=2; i<=n; i++){
            curr = prev + penultimate;
            penultimate = prev;
            prev = curr;

        }
        return prev;
    }
}