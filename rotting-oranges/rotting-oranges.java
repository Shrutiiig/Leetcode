class Solution {
    
    public class pair{↔}
    
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int time = 0;
        LinkedList<pair> que = new LinkedList<>();
        int[][] dir = { {0,1},{1,0},{0,-1},{-1,0} };
    
        for( int i=0; i<grid.length; i++ ){
            for( int j=0; j<grid[0].length; j++ ){
                if( grid[i][j] == 1 ) fresh++;
                else if( grid[i][j] == 2 ){
                    que.addLast(new pair(i,j));
                }
            }
        }
        if( fresh == 0 ) return 0;
        
        while( que.size() != 0 ){
            
            int size = que.size();
            while( size-- != 0 ){
                pair rv = que.removeFirst();
                for( int d=0; d<4; d++ ){
                    int r = rv.i + dir[d][0];
                    int c = rv.j + dir[d][1];
                    if( r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c] == 1 ){
                        fresh--;
                        grid[r][c] = 2;
                        que.addLast(new pair(r,c));
                    }
                }
            }
            time++;
        }
        if( fresh != 0 ) return -1;
        // System.out.println(total);
        // System.out.println(time);
        return time-1;
    }
}
