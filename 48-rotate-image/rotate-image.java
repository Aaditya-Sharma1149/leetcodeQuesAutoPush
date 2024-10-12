class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length/2 ; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][matrix.length - 1 - j];
            matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
    public void transpose(int[][] matrix){
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix [i][j];
                matrix[i][j] = temp;
            }
        }
    }
}