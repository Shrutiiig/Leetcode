class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        
        for( int i=0; i<m; i++ ){
            for( int j=0; j<n; j++ ){
                if( i == 0 || j == 0 ){
                    dp[i][j] = matrix[i][j] - '0';
                }else{
                    if( matrix[i][j] == '0' ){
                        dp[i][j] = 0;
                    }else{
                        dp[i][j] = Math.min( dp[i-1][j], Math.min( dp[i][j-1], dp[i-1][j-1] ) ) + 1;
                        //dp[i][j] = Math.max( p,1 );
                    }
                }
                ans = Math.max( ans,dp[i][j] );
            }
        }
        
        for( int i=0; i<m; i++ ){
            for( int j=0; j<n; j++ ){
                System.out.print( dp[i][j] );
            }
            System.out.println();
        }
        return ans*ans;
    }
