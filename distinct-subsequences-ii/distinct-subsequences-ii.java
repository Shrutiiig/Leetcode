class Solution {
    public int distinctSubseqII(String S) {
        int n = S.length();
        if( n == 0 ) return n;
        HashMap<Character,Integer> hm = new HashMap<>();
        int[] dp = new int[n+1];
        dp[0] = 1;
        int mod = (int)1e9 + 7;
        
        for( int i=1; i<=n; i++ ){
            dp[i] = (dp[i-1] * 2) % mod;
            if( hm.containsKey( S.charAt(i-1) ) ){
                int idx = hm.get( S.charAt(i-1) );
                dp[i] = (dp[i] - dp[idx-1] ) % mod;
            }
            hm.put( S.charAt(i-1), i );
        }
        
        if( dp[n] < 0 ) {
            dp[n] += mod;
        }
        return dp[n] - 1;
    }
}
