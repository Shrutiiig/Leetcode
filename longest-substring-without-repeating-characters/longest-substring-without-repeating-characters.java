class Solution {
    public int lengthOfLongestSubstring(String s) {
        if( s.length() == 0 ) return 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        
        int i=0;
        int j=0;
        int ans = 0;
        
        while( j < s.length() ){
            char ch = s.charAt(j);
            if( hm.containsKey(ch) ){
                int idx = hm.get(ch);
                for( int p=i; p<idx; p++ ) hm.remove( s.charAt(p) );
                i = idx+1;
                hm.put( ch,j );
            }else{↔}
            ans = Math.max( ans,j-i+1 );
            System.out.println( ans );
            j++;
        }
        return ans;
    }
}
