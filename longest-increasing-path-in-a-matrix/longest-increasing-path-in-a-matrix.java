class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if( matrix.length == 0 || matrix[0].length == 0 ) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] indegree = new int[m][n];
        LinkedList<int[]> que = new LinkedList<>();
        int level = 0;
        
        int[][] dir = { {0,1},{1,0},{0,-1},{-1,0} };
        for( int i=0; i<m; i++ ){
            for( int j=0; j<n; j++ ){
                for( int d=0; d<4; d++ ){
                    int r = i + dir[d][0];
                    int c = j + dir[d][1];
                    if( r>=0 && c>=0 && r<m && c<n && matrix[r][c] > matrix[i][j] ){
                        indegree[r][c]++;
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){↔} 
        
        while( que.size() != 0 ){
            int size = que.size();
            while( size-- != 0 ){
                int[] rv = que.removeFirst();
                int i = rv[0];
                int j = rv[1];
                for( int d=0; d<4; d++ ){
                    int r = i + dir[d][0];
                    int c = j + dir[d][1];
                    if( r>=0 && c>=0 && r<m && c<n && matrix[r][c] > matrix[i][j] && --indegree[r][c]==0  ){
                        que.addLast(new int[] {r,c});
                    }
                }
            }
            level++;
        }
        
        return level;
    }
}
