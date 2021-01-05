class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        if( n==0 || n==1 ) return n;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for( int i=0; i<n; i++ ){
            char ch = s.charAt(i);
            
            if( !hm.containsKey( ch ) ){
                hm.put( ch,1 );
            }else{
                int count = hm.get(ch);
                hm.put( ch,count+1 );
            }
        }
        
        int len = 0;
        for( int val : hm.values() ){
            len += val / 2 * 2;
            if( val % 2 == 1 && len % 2 == 0 ){
                len++;
            }
        }
        return len;
    }
}
