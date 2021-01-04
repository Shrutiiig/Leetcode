class Solution {
    public String licenseKeyFormatting(String S, int K) {
        int n = S.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int count=0;
        int i=n-1;
        while( i >= 0 ){
            
            char ch = S.charAt(i);
            if( ch == '-' ){
                i--;
            }else{
                if( count == K ){
                    sb.append('-');
                    count = 0;
                }
                
                if( ch >= '0' && ch <= '9' ){
                    sb.append( ch );
                }else{
                    sb.append( Character.toUpperCase(ch) );
                }
                ++count;
                i--;
            }
            
        }
        
        
        for( int j=sb.length()-1; j>=0; j-- ){
            ans.append( sb.charAt(j) );
        }
        
        return ans.toString();
    }
}
