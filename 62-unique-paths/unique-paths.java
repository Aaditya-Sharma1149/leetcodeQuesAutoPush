class Solution {
    
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m+1][n+1];
        for(int i=0; i<m+1; i++){
            for(int j=0; j<n+1; j++){
                dp[i][j]=-1;
            }
        }
        return helper(m,n,dp);

    }
    public int helper(int m,int n, int [][] dp){
        if(m==0 || n==0){
            return 0;
        }
        if(m==1 && n==1){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int right = helper( m, n-1, dp);
        int down = helper( m-1, n, dp);
        return dp[m][n]=right+down;
    }
}