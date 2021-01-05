class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if( n == 0 || n == 1 ) return n;
        
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        
        for( int gap=0; gap<n; gap++ ){
            for( int i=0,j=gap; j<n; i++,j++ ){
                if( gap == 0 ){
                    dp[i][j] = true;
                    count++;
                }else if( gap == 1 ){
                    char ch1 = s.charAt(i);
                    char ch2 = s.charAt(j);
                    if( ch1 == ch2 ){
                        count++;
                        dp[i][j] = true;
                    }
                }else{
                    char ch1 = s.charAt(i);
                    char ch2 = s.charAt(j);
                    if( ch1 == ch2 && dp[i+1][j-1] == true ){
                        count++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        
        return count;
    }
}
