class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        if( n <= 1 ) return 1;
        if( n == 2 ) return n;
        
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for ( int i=3; i<=n; i++ ){
            int res = 0;
            for( int j=0,k=i-1; j<i; j++,k-- ){
                int f1 = (dp[j] * dp[k]);
                res += f1;
            }
            dp[i] = res; 
        }
            
        return dp[n];
    }
}
