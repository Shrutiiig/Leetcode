class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {↔}
    
    public void helper(int[] arr, int tar, int idx, List<List<Integer>> ans, List<Integer> list ){
        if( tar == 0 || idx == arr.length ){
            if( tar == 0 ) ans.add( new ArrayList<Integer>(list) );
            return;
        }
        else if( tar < 0 ) return;
        
        list.add(arr[idx]);
        helper( arr,tar-arr[idx],idx,ans,list );
        list.remove(list.size() - 1);
        helper( arr,tar,idx+1,ans,list );
    }
}
