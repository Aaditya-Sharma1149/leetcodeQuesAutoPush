class Solution {
    public int reverse(int x) {
        int result = 0;
        int rem;
        while(x!=0){
            rem = x%10;
            if ( (result > Integer.MAX_VALUE/10) || (result==Integer.MAX_VALUE/10 && rem>7) )return 0;     
            if ( (result < Integer.MIN_VALUE/10) || (result==Integer.MIN_VALUE/10 && rem<-8)) return 0;  
            result = (result*10) + rem;
            x=x/10;
        }
        return result;
    }
}