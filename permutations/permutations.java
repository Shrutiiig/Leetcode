class Solution {
    public List<List<Integer>> permute(int[] nums) {↔}
    
    public void helper(int[] nums,boolean[] vis, int count, List<List<Integer>> ans, List<Integer> list ) {
        
        if( count == nums.length ){↔}
        
        for( int i=0; i<nums.length; i++ ){
            if( !vis[i] ){
                vis[i] = true;
                list.add( nums[i] );
                helper( nums,vis,count+1,ans,list );
                list.remove( list.get(list.size()-1) );
                vis[i] = false;
            }
        }
    }
}
