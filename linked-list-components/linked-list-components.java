/*↔*/
class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0; i<G.length; i++){
            hs.add(G[i]);
        }
        int count = 0;
        
        ListNode curr = head;
        while( curr != null ){
            if( hs.contains(curr.val) ){
                while( curr != null && hs.contains(curr.val) ) curr = curr.next;
                count++;
            }else curr = curr.next;
        }
        
        return count;
    }
}
