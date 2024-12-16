class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int i=s.length()-1;
        while(s.charAt(i)==' ' && i>=0){
                i--;
            }
        while(i>=0){
            if(s.charAt(i)==' '){
                return ans;
            }
            else{
                ans++;
                i--;
            }
        }
        return ans;
    }
}