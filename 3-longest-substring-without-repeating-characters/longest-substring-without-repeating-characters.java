class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();  
        while(r<s.length()){
            char ch = s.charAt(r);

            if(set.contains(ch)){
                ans=Math.max(ans,r-l);

                while(s.charAt(l)!=ch){
                    set.remove(s.charAt(l));
                    l++;
                }
                l++;
            }
            set.add(s.charAt(r));
            r++;
        }
        ans=Math.max(ans,r-l);
        return ans;
    }
}