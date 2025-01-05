class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(x==0) return 0;
        if(n<0){
            if(n==(-2147483648)){
                x=1/(x*x);
                n=1073741824;
            }
            else{
                x=1/x;
                n=n*(-1);
            }
        }
        if(n==1) {
            return x;
        }
        else if(n%2==0){
            return myPow(x*x,n/2);
        }else{
            return (myPow(x*x,(n/2)+1))/x;
        }
    }
}