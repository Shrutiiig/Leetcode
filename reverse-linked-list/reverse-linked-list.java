/*↔*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if( head == null || head.next == null ) return head;
        
        ListNode curr = head;
        ListNode next = curr.next;
        ListNode prev = null;
        
        while( curr.next != null ){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        return curr;
    }
}
