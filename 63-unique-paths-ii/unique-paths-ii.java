class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length-1;
        int c = obstacleGrid[0].length-1;
        int [][] dp = new int[r+1][c+1];
        for(int i=0; i<=r; i++){
            if(obstacleGrid[i][0]==1) break;
            dp[i][0]=1;
        }
        for(int j=0; j<=c; j++){
            if(obstacleGrid[0][j]==1) break;
            dp[0][j]=1;
        }
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[r][c];
    }
}