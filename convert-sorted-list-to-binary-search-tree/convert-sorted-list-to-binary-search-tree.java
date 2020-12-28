/*↔*/
/*↔*/
class Solution {
    
    public TreeNode sortedListToBST(ListNode head) {
        if( head == null ) return null;
        
        ListNode midNode = mid( head ); // find mid
        
        TreeNode root = new TreeNode( midNode.val );
        
        if( head == midNode ) return root;
        
        root.left = sortedListToBST( head );
        root.right = sortedListToBST( midNode.next );
        
        return root;
    }
    
    public ListNode mid( ListNode head ){↔}
}
