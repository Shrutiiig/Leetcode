class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper( n,0,0,ans,"" );
        return ans;
    }
    
    public void helper(int n, int open, int close, List<String> ans, String list) {
        if( open == n && close == n ){
            ans.add( list );
        }else if( open == n ){
            while( close<n ){
                list += ")";
                close++;
            }
            ans.add( list );
        }else if( close > open ){
            return;
        }else{
            helper( n,open+1,close,ans,list+"(" );
            helper( n,open,close+1,ans,list+")" );
        }
    }
}
