class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        // i can make fibonaaci series from 3 variable only not from n array size
        int fibPrev = 1;
        int fibNew = 1;
        int temp;
        for(int i=2; i<n; i++){
            temp=fibNew;
            fibNew= fibNew + fibPrev;
            fibPrev=temp;
        }
        return fibNew;
    }
}