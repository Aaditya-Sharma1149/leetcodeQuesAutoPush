class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if ( digits[len-1]!=9 ){
            digits[len-1]++;
            return digits;
        }
        int carry=0;
        for(int i=len-1; i>=0; i--){
            if(digits[i]==9){
                if(i==0){
                    int [] ans = new int[len+1];
                    ans[0]=1;
                    return ans;
                }
                digits[i]=0;
            }else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}