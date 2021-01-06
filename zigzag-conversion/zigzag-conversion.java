class Solution {
    public String convert(String s, int n) {
        if (n == 0 || n == 1 ) return s; 
        StringBuilder ans = new StringBuilder();
        List<Character>[] list = new ArrayList[n];
        
        for( int i=0; i<n; i++ ) {
            list[i] = new ArrayList<>();
        }
        
        int i=0;
        int row = 0;
        boolean down = true;
        while( i < s.length() ){
            char ch = s.charAt(i);
            
            if( down == true ){
                list[row].add(ch);
                if( row == n-1 ){
                    down = false;
                    row--;
                }else{
                    row++;
                }
            }else{
                list[row].add(ch);
                if( row == 0 ){
