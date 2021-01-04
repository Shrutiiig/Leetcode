class Solution {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        if( intervals.length == 0 ){
            int[][] ans = new int[1][2]; 
            ans[0] = newInterval;
            return ans;
        }
        
        Stack<int[]> st = new Stack<>();
        int j=0;
        while( j < intervals.length && intervals[j][1] < newInterval[0] ){
            st.push(intervals[j]);
            j++;
        }
        
        st.push( newInterval );
        for( int i=j; i<intervals.length; i++ ){
            newInterval = st.peek();
            
            if( intervals[i][1] >= newInterval[0] && intervals[i][0] <= newInterval[1] ){
                st.pop();
                newInterval[0] = Math.min( newInterval[0],intervals[i][0] );
                newInterval[1] = Math.max( newInterval[1],intervals[i][1] );
                st.push( newInterval );
            }else{
                st.push( intervals[i] );
            }
        }
        
        int[][] ans = new int[st.size()][2];
        for( int i=ans.length-1; i>=0; i-- ){
            int[] interval = st.pop();
            ans[i][0] = interval[0];
            ans[i][1] = interval[1];
        }
        return ans;
    }
}
