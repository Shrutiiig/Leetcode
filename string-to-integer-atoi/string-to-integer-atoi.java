class Solution {
    public int myAtoi(String s) {
        if( s.length() == 0 ) return 0;
        int num = 0;
        boolean pos = true;
        boolean flag = false;
        int i=0;
        
        while( i<s.length() && s.charAt(i) == ' ' ){
            i++;
        }
        
        if( i<s.length() && flag == false && (s.charAt(i) == '-' || s.charAt(i) == '+') ){
            if( s.charAt(i) == '-' ) pos = false;
            flag = true;
            i++;
        }
        
        while( i<s.length() ){
            char ch = s.charAt(i);
            
            if( ch >= '0' && ch <= '9' ){
                if (num > Integer.MAX_VALUE / 10 ||
                    ( num == Integer.MAX_VALUE / 10 && ch - '0' > Integer.MAX_VALUE % 10)){
                    if( pos == false ) return Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                num = num * 10 + (ch - '0');
            }else{
                if( pos == false ) return -1*num;
                return num;
            }
            i++;
        }
        
        //if( num > Integer.MIN_VALUE && num < 2147483647 ){
            if( pos == false ) return -1*num;
            return num;
        
    }
