class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) { 
        for(int j=1; j<matrix[0].length; j++){
            for(int i=1; i<matrix.length; i++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}