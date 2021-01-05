class Solution {
    public int numDistinct(String s, String t) {
        if( s.length() == 0 ) return 0;
        int[][] dp = new int[t.length() + 1][s.length()+1];
        
        for (int i=0; i<=t.length(); i++){
            for (int j=0; j<=s.length(); j++){
                if( i == 0 ){
                    dp[i][j] = 1;
                }else if( j == 0 ){
                    dp[i][j] = 0;
                }else{
                    if( t.charAt(i-1) == s.charAt(j-1) ){
                        dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        
        for (int i=0; i<=t.length(); i++){
            for (int j=0; j<=s.length(); j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[t.length()][s.length()];
    }
}
