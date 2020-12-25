class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int bulls = 0;
        int cows = 0;
        for( int i=0; i<secret.length(); i++ ){↔}
        
        for( int i=0; i<secret.length(); i++ ){
            if( secret.charAt(i) == guess.charAt(i) ){
                bulls++;
                int val = hm.get(secret.charAt(i));
                hm.put( secret.charAt(i),val-1 );
                if (hm.get(secret.charAt(i)) == 0) hm.remove( secret.charAt(i) );
            }
        }
        
        for( int i=0; i<secret.length(); i++ ){
            if( secret.charAt(i) != guess.charAt(i) && hm.containsKey( guess.charAt(i) ) ) {
                cows++;
                int val = hm.get(guess.charAt(i));
                hm.put( guess.charAt(i),val-1 );
                if (hm.get(guess.charAt(i)) == 0) hm.remove( guess.charAt(i) );
​
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(bulls + "A" + cows + "B");
        return sb.toString();
    }
}
​
​
​
​
// Now loop through the guess number and check if the digit of guess number is equal to digit of secret number at same position then increment aCount by 1 and decrement the count of that digit from the map.
// Now loop again through the guess number and check if the digit of guess number is not equal to digit of secret number then there is a possibility that a number is present at different position so if the number is present in the countMap and it's count>0 then increment bCount by 1 and decrement the count of that digit from the map.
// Now return both the counts as a string aCount+"A"+bCount+"B" .
// For example:
// Input is:
// Secret Number: "1122"
// Guess Number: "1222"
​
