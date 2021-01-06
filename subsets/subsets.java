class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        
        for( int num : nums ){
            List<List<Integer>> temp = new ArrayList<>();
            for( List<Integer> list : ans ){
                temp.add(new ArrayList<Integer>(list){{add(num);}});
            }
            
            for( List<Integer> list : temp ){
                ans.add( new ArrayList<Integer>(list) );
            }
        }
        return ans;
    }
}
