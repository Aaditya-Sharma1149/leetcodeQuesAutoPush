class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int [][] dp = new int[matrix.length][matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int j=0; j<dp[0].length; j++){
            dp[0][j]=matrix[0][j]; 
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){

                int left; int right; int up;

                if( j==0 )  left = Integer.MAX_VALUE;
                else{
                    left = dp[i-1][j-1];
                }

                if( j>matrix[0].length-2 ) right = Integer.MAX_VALUE;
                else{
                    right = dp[i-1][j+1];
                }

                up = dp[i-1][j];

                dp[i][j]=Math.min(Math.min(left,right),up)+matrix[i][j];
            }
        }
        // for(int r=0; r<dp.length; r++){
        //     for(int c=0; c<dp[0].length; c++){
        //         System.out.print(dp[r][c]);
        //     }
        //     System.out.println();
        // }
        for(int i=0; i<dp[0].length; i++){
            ans = Math.min(ans,dp[matrix.length-1][i]);
        }
        return ans;
    }
}