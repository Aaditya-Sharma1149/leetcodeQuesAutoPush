class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        for(int i=cost.length-1; i>=0; i--){
            ans += cost[i];
        }
        for(int i=cost.length-3; i>=0; i=i-3){
            ans = ans - cost[i];
        }
        return ans;
    }
}