class Solution {
    int[] par;
    public int numSimilarGroups(String[] strs) {↔}
    
    public int findPar( int u ){↔}
    
    public boolean isSimilar( String s1, String s2 ){
        int count = 0;
        for( int i=0; i<s1.length();i++ ){
            if( s1.charAt(i) != s2.charAt(i) ){
                ++count;
            }
        }
        if( count > 2 ) return false;
        return true;
    }
    
    
}
