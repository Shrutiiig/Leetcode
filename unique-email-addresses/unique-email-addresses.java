class Solution {
    public int numUniqueEmails(String[] emails) {
        int count = 0;
        HashSet<String> hs = new HashSet<>();
        
        for( String email : emails ){
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            boolean divider = false;
            
            for( int i=0; i<email.length(); i++ ){
                char ch = email.charAt(i);
                
                if( ch == '.' ){
                    if( divider == true ) sb.append( ch );
                }else if( ch == '+' ){
                    flag = true;
                }else if( ch == '@' ){
                    sb.append( ch );
                    divider = true;
                    flag = false;
                }else{
                    if( flag == false ) sb.append( ch );
                }
            }
            
            String str = sb.toString();
            hs.add( str );
        }
        System.out.println(hs);
        return hs.size();
    }
}
