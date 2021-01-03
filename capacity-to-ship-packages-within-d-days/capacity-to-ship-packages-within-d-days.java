class Solution {
    // Binary Search
    // Explanation : https://www.youtube.com/watch?v=CoNBRq5JSz0
    
      //int max_cap = 0;
      public int shipWithinDays(int[] weights, int D){
        
        int max = 0;
        int sum = 0;
        for( int w : weights ){
            sum += w;
            max = Math.max( max,w );
        }
        int ans = 0;
        int i = max;
        int j = sum;
        while( i <= j ){
            int mid = (i + j) / 2; 
            int count = DaysReq( mid,weights );
            System.out.println( mid );
            if( count > D ){
                i = mid+1;
            }else{
                ans = mid;
                j = mid-1;
            }
            
        }
        return ans;
    }
    
    public int DaysReq(int max_wt, int[] weights){
        
        int count = 1;
        int sum = 0;
        for( int w : weights ){
            if( sum + w > max_wt ){
                sum = 0;
                count++;
            }
            sum += w;
        }
        return count;
    }
    
}
