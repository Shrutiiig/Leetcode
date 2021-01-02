class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if( grid.length == 1 && grid[0][0] == 0 ) return 1;
        if( (grid.length > 1) && (grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1) ) return -1;
        int[][] dir = {{-1, -1}, {-1, 0}, {0, -1}, {-1, 1}, {1, -1}, {0, 1}, {1, 0}, {1, 1}};
        int n = grid.length;
        
        LinkedList<int[]> que = new LinkedList<>();
        que.addLast( new int[] {0,0} );
        int level = 1;
        int[] rv = new int[2];
        grid[0][0] = 1;
        
        while( que.size() != 0 ){
            int size = que.size();
            while( size-- != 0 ){
                rv = que.removeFirst();
                int i = rv[0];
                int j = rv[1];
                for( int d=0; d<8; d++ ){
                    int r = i + dir[d][0];
                    int c = j + dir[d][1];
                    
                    if( r>=0 && c>=0 && r<n && c<n && grid[r][c]==0 ){
                        if( r == n-1 && c == n-1 ) return level+1;
                        que.addLast( new int[]{r,c} );
                        grid[r][c] = 1;
                    }
                }
                    
            }
            level++;
        }
        System.out.println( rv[0] + " " + rv[1] );
        return -1;
    }
}
