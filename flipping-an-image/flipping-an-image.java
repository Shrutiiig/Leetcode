class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for( int i=0; i<A.length; i++ ){
            int j=0;
            int k=A[i].length-1;
            while( j <= k ){
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
                j++;
                k--;
            }
        }
        
        for( int i=0; i<A.length; i++ ){
            for( int j=0; j<A[0].length; j++ ){
                if( A[i][j] == 0 ) A[i][j] = 1;
                else A[i][j] = 0;
            }
        }
        return A;
        
    }
}
