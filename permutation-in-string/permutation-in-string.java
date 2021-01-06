class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for( int i=0; i<s1.length(); i++ ){
            arr1[ s1.charAt(i) - 'a' ]++;
        }
        for( int i=0; i<s1.length(); i++ ){
            arr2[ s2.charAt(i) - 'a' ]++;
        }
        
        if( Arrays.equals( arr1,arr2 ) ) return true;
        
        int i=1;
        int j=s1.length();
        while( j<s2.length() ){
            char ch = s2.charAt(j);
            arr2[ s2.charAt(i-1) - 'a' ]--;
            arr2[ ch - 'a' ]++;
            if( Arrays.equals( arr1,arr2 ) ) return true;
            i++;
            j++;
        }
        return false;
    }
}
