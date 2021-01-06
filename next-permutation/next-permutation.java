class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if( n == 1 ) return;
        
        int i = n-1;
        while( i > 0 ){
            if( nums[i-1] < nums[i] ){
                nextGreater( nums,i-1 );
                return;
            }else{
                if( i == 1 ){
                    Arrays.sort(nums);
                    return;
                }
                i--;
            }
        }
    }
    
    public void nextGreater(int[] nums, int si){
        int num = nums[si];
        int idx = -1;
        for( int i=si+1; i<nums.length; i++ ){
            if( nums[i] > num ){
                if( idx == -1 ){
                    idx = i;
                }else{
                    if( nums[i] < nums[idx] ){
                        idx = i;
                    }
                }
            }
        }
        nums[si] = nums[idx];
        nums[idx] = num;
        
        Arrays.sort( nums,si+1,nums.length );
    }
}
