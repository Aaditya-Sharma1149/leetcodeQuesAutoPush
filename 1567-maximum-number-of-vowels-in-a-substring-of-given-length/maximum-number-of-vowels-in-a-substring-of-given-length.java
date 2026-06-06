class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int ans = 0;
        int r = 0;
        while(r<k){
            if("aeiou".indexOf(s.charAt(r)) != -1){
                count ++;
            } 
            r++;
        }
        while(r<s.length()){
            ans = Math.max(count , ans);
            if("aeiou".indexOf(s.charAt(r-k)) != -1){
                count --;
            } 
            if("aeiou".indexOf(s.charAt(r)) != -1){
                count ++;
            } 
            r++;
        }
        ans = Math.max(count , ans);
        return ans;
    }
}