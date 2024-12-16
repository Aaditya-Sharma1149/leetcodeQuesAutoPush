class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int i=s.length()-1;
        if(s.charAt(s.length()-1)==' '){
            while(s.charAt(i)==' ' && i>=0){
                i--;
            }
        }
        for(; i>=0; i--){
            if(s.charAt(i)==' '){
                return ans;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}