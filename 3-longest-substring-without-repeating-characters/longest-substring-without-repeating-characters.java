class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0;
        int l = 0;
        int ans =0;
        HashMap <Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                int idx = map.get(ch);
                ans = Math.max(ans,r-l);
                while(l<=idx){
                    map.remove(s.charAt(l));
                    l++;
                }
            }
            map.put(ch,r);
            r++;
        }
        ans = Math.max(ans,r-l);
        return ans;
    }
}