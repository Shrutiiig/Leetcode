class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if( envelopes.length==0 ) return 0;
        Arrays.sort(envelopes, (a,b)-> {
            if( a[0] != b[0]  ) return a[0] - b[0];
            return b[1] - a[1];
        });
        
        int[] dp = new int[envelopes.length];
        dp[0] = 1;
        
        int max = 1;
        for( int i=1; i<envelopes.length; i++ ){
            int mtn = 0;
            for( int j=0; j<i; j++ ){
                if( envelopes[j][1] < envelopes[i][1] && dp[j] > mtn ){
                    mtn = dp[j];
                }
            }
            dp[i] = mtn + 1;
            max = Math.max( max,dp[i] );
        }
        return max;
    }
}
