class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        for( int i=0; i<matrix.length; i++ ){
            for( int j=0; j<matrix[0].length; j++ ){
                if( matrix[i][j] == 0 ){
                    row.add( i );
                    col.add( j );
                    System.out.print( i + " " + j );
                }
                System.out.println();
            }
        }
        
        for( int e : row ){
            for( int i=0; i<matrix[0].length; i++ ){
                matrix[e][i] = 0;
            }
        }
        
        for( int e : col ){
            for( int i=0; i<matrix.length; i++ ){
                matrix[i][e] = 0;
            }
        }
    }
}
