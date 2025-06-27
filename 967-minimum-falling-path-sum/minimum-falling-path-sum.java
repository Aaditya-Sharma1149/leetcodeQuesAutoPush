class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int [][] dp = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0; i<matrix[0].length; i++){
            ans = Math.min(helper(matrix,0,i,dp),ans);
        }
        return ans;
    }
    private int helper(int [][] matrix, int r, int c,int [][] dp){
        if(c<0) return Integer.MAX_VALUE;
        if(c>=matrix[0].length) return Integer.MAX_VALUE;
        if(r>=matrix.length) return 0;
        
        if(dp[r][c]!=Integer.MAX_VALUE) return dp[r][c];

        int left = helper(matrix,r+1,c-1,dp);
        int bottom = helper(matrix,r+1,c,dp);
        int right = helper(matrix,r+1,c+1,dp);

        return dp[r][c] = Math.min(Math.min(left,right),bottom)+matrix[r][c];
    }
}