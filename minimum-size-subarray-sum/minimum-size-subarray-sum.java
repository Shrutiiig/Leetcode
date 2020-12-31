class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if( nums.length == 0 ) return 0;
        if( nums.length == 1 ){
            if(nums[0] >= s) return 1;
            else return 0;
        }
        LinkedList<Integer> que = new LinkedList<>();
        que.addLast( nums[0] );
        int sum = nums[0];
        int len = 1;
        int ans = Integer.MAX_VALUE;
        int i=1;
        if(nums[0] >= s) return 1;
        while( i < nums.length ){
            
            if( nums[i] >= s ) return 1;
            
            que.addLast( nums[i] );
            sum += nums[i];
            ++len;
            System.out.println(sum);
            while( que.size() != 0 && (sum - que.peek() >= s) ){
                int rv = que.removeFirst();
                sum -= rv;
                --len;
                System.out.println(sum);
            }
            if( sum >= s ) ans = Math.min(ans,len);
            i++;
        }
        if( len == nums.length && sum < s ) return 0;
        return ans;
    }
}
