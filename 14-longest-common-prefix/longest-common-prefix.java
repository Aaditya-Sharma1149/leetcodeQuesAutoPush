class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int count=0;
        while(compare(strs,count)){
            count++;
        }
        if(count==-1){
            return "";
            }
        String str = new String(strs[0].substring(0,count));
        return str;
    }
    public boolean compare(String[] strs , int j){
        for(int i=0; i<strs.length-1; i++){
            if(strs[i].length()<=j || strs[i + 1].length()<= j){
                return false;
            }
            if (strs[i].charAt(j)!=strs[i + 1].charAt(j)) {
                return false;
            }
        }
        return true;
    }
}