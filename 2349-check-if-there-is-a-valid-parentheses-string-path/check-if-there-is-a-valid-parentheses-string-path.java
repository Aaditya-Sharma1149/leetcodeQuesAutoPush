class Solution {
    public boolean hasValidPath(char[][] grid) {
        Boolean [][][] dp = new Boolean [grid.length+1][grid[0].length+1][(grid.length + grid[0].length)/2 + 3];
        return helper(grid,0,0,0,0,dp);
    }
    public boolean helper(char [][] grid, int row, int col, int open, int close, Boolean [][][] dp){
        if(row>=grid.length) return false;
        if(col>=grid[0].length) return false;

        if( grid[row][col] == '(' ) open++;
        if( grid[row][col] == ')' ) close++;

        int bal = open-close;
        if(bal<0) return false;
        if(bal> (grid.length + grid[0].length)/2 + 1) return false;
        if(dp[row][col][bal] != null){
            return dp[row][col][bal];
        }

        if(row == grid.length-1 && col == grid[0].length-1 ) return dp[row][col][bal] = close==open;

        return dp[row][col][bal] = helper(grid, row+1, col, open, close,dp) || helper(grid, row, col+1, open, close,dp);
    }

}