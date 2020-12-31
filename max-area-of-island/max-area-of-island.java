class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if( grid.length == 0 || grid[0].length == 0 ) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] dir = { {1,0},{-1,0},{0,1},{0,-1} };
        
        int ans = 0;
        for( int i=0; i<m; i++ ){
            for( int j=0; j<n; j++ ){
                if(grid[i][j] == 1){
                    int val = dfs(grid,i,j,dir);
                    ans = Math.max( ans,val );
                }
            }
        }
        return ans;
    }
    
    public int dfs(int[][] grid, int row, int col, int[][] dir){
        grid[row][col] = 0;
        int sum = 1;
        for( int i=0; i<4; i++ ){
            int r = row + dir[i][0];
            int c = col + dir[i][1];
            if( r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c] == 1 ) sum += dfs(grid,r,c,dir);
        }
        return sum;
    }
}
