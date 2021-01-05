class Solution {
    public int numSquares(int n) {
        if( n == 0 || n== 1 ) return 1;
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for( int i=2; i<=n; i++ ){
            int min = Integer.MAX_VALUE;
            for( int j=1; j*j <= i; j++ ){
                int rem = i - j*j;
                min = Math.min( min, dp[rem] );
            }
            dp[i] = min+1;
        }
        return dp[n];
    }
}
