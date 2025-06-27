class Solution {
    public int minPathSum(int[][] grid) {
        int [][] dp = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                dp[i][j]=-1;
            }
        }
        return helper(grid, 0, 0,dp);
    }
    public int helper(int [][]grid, int i, int j, int [][]dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            return  grid[i][j];
        }
        if(i==grid.length){
            return Integer.MAX_VALUE;
        }
        if(j==grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j]=Math.min(helper(grid, i+1, j, dp),helper(grid, i, j+1, dp)) + grid[i][j];
    }
}