class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(x==0) return 0;
        if (n == 1) return x;
        if(n==-2147483648){
            x=x*x;
            n=-1073741824;
        }
        if(n<0){
            x=1/x;
            n=n*(-1);
        }
        return pow(x,n);
    }
    public double pow(double x, int n) {
        if ((n & 1) == 0){
            x=myPow(x*x,n/2);
            }
        else{
            x=x*myPow(x*x,n/2);
        }
        return x;
    }
}