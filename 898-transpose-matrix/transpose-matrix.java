class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //because non square matrix we have to make new matrix , otherwise we can solbe it using no extra space
        int[][] transposed = new int[cols][rows];  // Create a new matrix with swapped dimensions
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];  // Transpose the matrix by swapping rows and columns
            }
        }
        
        return transposed;
    }
}