class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper( k,n,1,ans,new ArrayList<Integer>() );
        return ans;
    }
    
    public void helper( int k, int tar, int num, List<List<Integer>> ans, List<Integer> list ){
        if( tar == 0 ){
            if( list.size() == k ){
                ans.add( new ArrayList<Integer>(list) );
            }
            return;
        }
        else if( tar < 0 || num > 9 ) return;
        
        list.add(num);
        helper( k,tar-num,num+1,ans,list );
        list.remove( list.get(list.size()-1) );
        
        helper( k,tar,num+1,ans,list );
    }
}
