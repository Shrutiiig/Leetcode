class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        
        if( s.length() < p.length() || s.length() == 0 ) return ans;
        int s_len = s.length();
        int p_len = p.length();
        
        int[] p_arr = new int[26];
        int[] arr = new int[26];
        for( int i=0; i<p_len; i++ ){
            char ch = p.charAt(i);
            p_arr[ ch - 'a' ]++;
        }
        
        for( int i=0; i<p_len; i++ ){
            char ch = s.charAt(i);
            arr[ ch - 'a' ]++;
        }
        
        if( Arrays.equals( p_arr,arr ) ) ans.add(0);
        
        int i=1;
        int k = p_len;
        
        while( k < s_len ){
            char ch = s.charAt(k);
            arr[s.charAt(i-1) - 'a']--;
            arr[ ch - 'a' ]++;
            if( Arrays.equals( p_arr,arr ) ) ans.add(i);
            i++;
            k++;
        }
        
        return ans;
    }
}          
