class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] dir = { {1,0},{0,1},{-1,0},{0,-1} };
        LinkedList<int[]> que = new LinkedList<>();
        boolean[][] vis = new boolean[matrix.length][matrix[0].length];
        
        for( int i=0; i<matrix.length; i++ ){
            for(int j=0; j<matrix[0].length; j++){
                if( matrix[i][j] == 0 ){
                    que.addLast( new int[]{i,j} );
                    vis[i][j] = true;
                }
            }
        }
        
        while( que.size() != 0 ){
            int[] rv = que.removeFirst();
            int i = rv[0];
            int j = rv[1];
            
            for( int d=0; d<4; d++ ){
                int r = i + dir[d][0];
                int c = j + dir[d][1];
                if(r>=0 && c>=0 && r<matrix.length && c<matrix[0].length && vis[r][c] == false){
                    matrix[r][c] = matrix[i][j] + 1;
                    vis[r][c] = true;
                    que.addLast( new int[]{r,c} );
                } 
            }
        }
        
        return matrix;
    }
}
