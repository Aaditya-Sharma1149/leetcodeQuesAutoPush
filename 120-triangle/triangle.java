class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {


        int [][] dp = new int [triangle.size()][];

        for(int i=0; i<triangle.size(); i++){
            dp[i] = new int [i+1];
        }
        for(int i=0; i<=triangle.size()-1; i++){
            dp[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
        }
        for(int r=triangle.size()-2; r>=0; r--){
            for(int c=0; c<dp[r].length; c++){
                dp[r][c] = triangle.get(r).get(c) + Math.min(dp[r+1][c],dp[r+1][c+1]);
            }
        }
        return dp[0][0];
    }
}