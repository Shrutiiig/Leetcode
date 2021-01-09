class Solution {
    /*
        1. Make a 2D boolean DP, dp[0] = odd & dp[1] = even
        2. last indices will be true since we can definitely reach there.
        3. Now, start from last indices.
    */
    public int oddEvenJumps(int[] A) {
        int n = A.length;
        if( n<=1 ) return n;
        boolean[][] dp = new boolean[n][2];
        dp[n-1][0] = true;
        dp[n-1][1] = true;
        TreeMap<Integer,Integer> hm = new TreeMap();
        hm.put( A[n-1],n-1 );
        int count = 1;
        
        for( int i=n-2; i>=0; i-- ){
            int val = A[i];
            if( hm.containsKey( val ) ){
                int v = hm.get(val);
                dp[i][0] = dp[v][1];
                dp[i][1] = dp[v][0];
            }else{
                Integer lower = hm.lowerKey(val);
                Integer higher = hm.higherKey(val);
                
                if( lower != null ) dp[i][1] = dp[hm.get(lower)][0];
                if( higher != null ) dp[i][0] = dp[hm.get(higher)][1];
            }
            hm.put( val,i );
            if( dp[i][0] == true ) count++;
        }
        return count;
    }
}
