class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort( intervals, (a,b) -> Integer.compare(a[0], b[0]) );
        
        
        Stack<int[]> st = new Stack<>();
        
        for( int[] slot : intervals ){
            
            if( st.size() == 0 ){
                st.push( slot );
            }else{
                int[] top_ = st.peek();
                
                if( top_[1] >= slot[0] ){
                    st.pop();
                    top_[0] = Math.min( top_[0],slot[0] );
                    top_[1] = Math.max( top_[1],slot[1] );
                    st.push( top_ );
                }else{
                    st.push( slot );
                }
            }
        }
        
        int[][] ans = new int[st.size()][2];
        for( int k=st.size()-1; k>=0; k-- ){
            ans[k] = st.pop();
        }
        return ans;
    }
}
