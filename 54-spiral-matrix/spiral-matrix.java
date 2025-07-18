class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        int upRow = 0;
        int downRow = 0;
        int rCol = 0;
        int lCol = 0;
        while(true){
            if(j>=matrix[0].length - rCol) break;
            while(j<matrix[0].length - rCol){
                ans.add(matrix[i][j]);
                j++;
            }
            upRow++;
            j--;
            i++;
            if(i>=matrix.length - downRow) break;
            while(i<matrix.length - downRow){
                ans.add(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            rCol++;
            if(j<lCol) break;
            while(j>=0+lCol){
                ans.add(matrix[i][j]);
                j--;
            }
            j++;
            i--;
            downRow++;
            if(i<upRow) break;
            while(i>=0+upRow){
                ans.add(matrix[i][j]);
                i--;
            }
            i++;
            lCol++;
            j++;
        }
        return ans;
    }
}