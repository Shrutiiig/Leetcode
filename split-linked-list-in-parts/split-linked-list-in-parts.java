/*↔*/
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] list = new ListNode[k];
        if( root == null ) return list;
        
        int size = size_(root);
        int rem = size % k;
        int width = size / k;
        
        ListNode curr = root;
        for( int i=0; i<k ; i++ ){
            ListNode head = curr;
            for (int j = 0; j < width + (i < rem ? 1 : 0) - 1; ++j) {
                if (curr != null) curr = curr.next;
            }
            if (curr != null) {
                ListNode prev = curr;
                curr = curr.next;
                prev.next = null;
            }
            list[i] = head;
        }
        
        return list;
    }
    
    public int size_( ListNode root ){↔}
}
