class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        if( n == 0 ) return 0;
        int[][] dp = new int[n][n];
        
        for( int gap=0; gap<n; gap++ ){
            for( int i=0,j=gap; j<n; j++,i++ ){
                if( gap == 0 ){
                    dp[i][j] = 1;
                }else{
                    if( s.charAt(i) == s.charAt(j) ){
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }else{
                        dp[i][j] = Math.max( dp[i+1][j], dp[i][j-1] );
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}
