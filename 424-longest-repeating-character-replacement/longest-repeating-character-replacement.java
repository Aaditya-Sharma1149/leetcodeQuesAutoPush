class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int charArr [] = new int [126]; 
        int maxFreq = 0;
        int ans = 0;
        while(r<s.length()){
            char ch = s.charAt(r);
            charArr[ch]++;

            if(charArr[ch]>maxFreq){
                maxFreq = charArr[ch];
            }

            while(r-l+1-maxFreq>k){
                // if(charArr[s.charAt(l)]==maxFreq){
                //     maxFreq--;
                // }
                charArr[s.charAt(l)]--;
                l++;
            }

            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}