class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false; // Flag for the first row
        boolean firstColZero = false; // Flag for the first column

        // Step 1: Determine which rows and columns need to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) firstRowZero = true; // Mark the first row
                    if (j == 0) firstColZero = true; // Mark the first column
                    matrix[i][0] = 0; // Mark the row
                    matrix[0][j] = 0; // Mark the column
                }
            }
        }

        // Step 2: Use markers to set inner matrix cells to zero
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle the first row if needed
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle the first column if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
