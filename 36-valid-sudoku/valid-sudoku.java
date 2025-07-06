class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9; i++){
            boolean[] seen = new boolean[10];
            for(int j=0; j<9; j++){
                if(board[i][j]=='.') continue;
                if(seen[board[i][j]-'0']) return false;
                seen[board[i][j]-'0']=true;
            }
        }
        for(int j=0; j<9; j++){
            boolean[] seen = new boolean[10];
            for(int i=0; i<9; i++){
                if(board[i][j]=='.') continue;
                if(seen[board[i][j]-'0']) return false;
                seen[board[i][j]-'0']=true;
            }
        }
        for(int rowCell=0; rowCell<9; rowCell+=3){
            for(int colCell=0; colCell<9; colCell+=3){
               
                boolean[] seen = new boolean[10];
                for(int row = rowCell; row<rowCell+3; row++){
                    for(int col = colCell; col<colCell+3; col++){
                        if(board[row][col]=='.') continue;
                        if(seen[board[row][col]-'0']) return false;
                        seen[board[row][col]-'0'] = true;
                    }
                }
            }
        }
        return true;

    }
}