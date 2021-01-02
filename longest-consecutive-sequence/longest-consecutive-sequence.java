class Solution {
    public int longestConsecutive(int[] nums) {
        if( nums.length == 0 ) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for( int num : nums ){
            hs.add(num); // num, count_till_now
        }
        
        int ans = 0;
        int atn = 1;
        for( int num : nums ){
            if( hs.contains(num-1) ){
                int c_num = num-1;
                while( hs.contains(c_num) ){
                    atn++;
                    c_num = c_num-1;   
                }
            }
            ans = Math.max( ans,atn );
            atn = 1;
        }
        return ans;
    }
}
