class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if( n == 0 ) return 0;
        
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        
        for( int i=1; i<n; i++ ){
            int max_till_now = 0;
            for( int j=0; j<i; j++ ){
                if( nums[j] < nums[i] && dp[j] > max_till_now ){
                    max_till_now = dp[j];
                }
            }
            dp[i] = max_till_now + 1;
            max = Math.max( max, dp[i] );
        }
        return max;
    }
}
