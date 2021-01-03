class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for( int i=0; i<nums.length; i++ ){
            if( !hm.containsKey(nums[i]) ){
                hm.put( nums[i],1 );
            }else{
                int val = hm.get( nums[i] );
                hm.put( nums[i],val+1 );
            }
        }
        
        for( int key : hm.keySet() ){
            if( hm.get(key) == 1 ) return key;
        }
        return 0;
    }
}
