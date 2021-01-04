class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if( n==0 || n==1 ) return true;
        boolean[] dp = new boolean[n];
        dp[0] = true;
        
        for( int i=0; i<n-1; i++ ){
            if( dp[i] == true ){
                int max_reach = nums[i];
                if( max_reach == 0 ) continue;
​
                for( int j=i+1; j<=i+max_reach && j<n; j++ ){
                    dp[j] = true;
                    if( dp[n-1] == true ) return true;
                }
            }
        }
        return dp[n-1];
    }
}
