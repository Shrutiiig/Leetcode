class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper( n,k,1,ans,new ArrayList<Integer>() );
        return ans;
    }
    
    public void helper( int n, int k, int idx, List<List<Integer>> ans,List<Integer> ans1 ) {
        if( k==0 ){
            ans.add(new ArrayList<Integer>(ans1));
            return;
        }
        
        for( int i=idx; i<=n; i++ ){
            ans1.add( i );
            helper( n,k-1,i+1,ans,ans1 );
            ans1.remove(ans1.size()-1);
        }
    }
}
