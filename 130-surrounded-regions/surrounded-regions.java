class Solution {
    public void solve(char[][] board) {
        boolean [][] visited = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            if(board[i][0]=='O'){
                dfs(visited, board, i, 0);
            }
        }
        for(int i=0; i<board.length; i++){
            if(board[i][board[0].length-1]=='O'){
                dfs(visited, board, i, board[0].length-1);
            }
        }
        for(int j=0; j<board[0].length; j++){
            if(board[0][j]=='O'){
                dfs(visited, board, 0, j);
            }
        }
        for(int j=0; j<board[0].length; j++){
            if(board[board.length-1][j]=='O'){
                dfs(visited, board, board.length-1, j);
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(visited[i][j]==false){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(boolean [][] visited, char[][] board,int i, int j){
        if(board[i][j]!='O') return;
        if(visited[i][j]==true) return;
        visited[i][j] = true;
        if(i+1<board.length ){
            dfs(visited, board, i+1, j);
        }
        if(i-1>=0){
            dfs(visited, board, i-1, j);
        }
        if(j+1<board[0].length){
            dfs(visited, board, i, j+1);
        }
        if(j-1>=0){
            dfs(visited, board, i, j-1);
        }
    }
    
}