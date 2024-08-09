class Solution {
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        if(x<0 || x%10==0){
            return false;
        }

        int rev=reverseInt(x);
        if(rev==x){
            return true;
        }
        return false;
    }
    public int reverseInt(int x){
        int reverse=0;
        while(x!=0){
            int rem=x%10;
            if( (reverse>Integer.MAX_VALUE/10) || (reverse==Integer.MAX_VALUE/10 && rem>7) ){
                return 0;   //out of range of int;
            }
            reverse = (reverse*10) + rem;
            x=x/10;
        }
        return reverse;
    }
}