class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(isPowerOfTwo(n)){
            if((n & oddPowerOfTwo())==0) return true;
        }
        return false;
    }
    public boolean isPowerOfTwo(int n) {
        if( ((n) & (n-1)) ==0) return true;
        return false;
    }
    public int oddPowerOfTwo(){ //sum of GP 2 + 2^3 + 2^5 + ... +2^29;
        return 715827882; //can directly use 715827882
        // int ans = 4;
        // for(int i=1; i<15; i++){
        //     ans = ans * 4;
        // } 
        // ans = ((ans-1)*2)/3;
        // return ans;
    }
}