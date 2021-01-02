class Solution {
    public int numEnclaves(int[][] A) {↔}
    
    public void helper( int[][] A, int i, int j, int[][] dir ){
        A[i][j] = 0;
        for( int d=0; d<4; d++ ){
            int r = i + dir[d][0];
            int c = j + dir[d][1];
            
            if( r>0 && c>0 && r<A.length-1 && c<A[0].length-1 && A[r][c] == 1 ){
                helper( A,r,c,dir );
            }
        }
    }
}
