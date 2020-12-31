class Solution {
    public void solve(char[][] board) {↔}
    
    public void dfs(char[][] board, int i, int j, int[][] dir){↔}
    
    public void dfs_(char[][] board, int i, int j, int[][] dir){
        board[i][j] = 'X';
        
        for( int d=0; d<4; d++ ){
            int r = i + dir[d][0];
            int c = j + dir[d][1];
            if( r>=0 && c>=0 && r<board.length && c<board[0].length  && board[r][c] == 'O' ){
                dfs_( board,r,c,dir );
            }
        }
    }
    
}
