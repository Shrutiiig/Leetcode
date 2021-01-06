class Solution {
    public boolean isSubsequence(String s, String t) {
        if( s.length() == 0 ) return true;
        if( t.length() == 0 ) return false;
        int i=0;
        int j=0;
        
        while( i<s.length() && j<t.length() ){
            if( s.charAt(i) == t.charAt(j) ){
                if( i == s.length()-1 ) return true;
                i++;
                j++;
            }else {
                j++;
            }
        }
        return false;
    }
}
