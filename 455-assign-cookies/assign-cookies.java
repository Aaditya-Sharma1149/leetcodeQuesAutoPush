class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i = 0;
        int j = 0;

        while( i<g.length && j<s.length){
            if( s[j] >= g[i]){
                count++;
                j++;
                i++;
            }
            else{
                j++;
            }
        }
        return count;
 
    }
}