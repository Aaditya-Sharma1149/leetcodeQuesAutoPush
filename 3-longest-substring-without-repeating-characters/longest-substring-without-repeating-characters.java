class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0; 
        int r = 0;
        int ans = 0;
        int [] charArr = new int[1000];
        while(r<s.length()){
            charArr[s.charAt(r)]++;
            if(charArr[s.charAt(r)]==1){
                ans = Math.max(ans,r-l+1);
            }
            while(charArr[s.charAt(r)]>1){
                charArr[s.charAt(l)]--;
                l++;
            }
            r++;
        }
        if(ans==0) return s.length();
        return ans;
    }
}