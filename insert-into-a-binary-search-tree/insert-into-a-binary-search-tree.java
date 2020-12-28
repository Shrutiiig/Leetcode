/*↔*/
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if( root == null ) {
            TreeNode node = new TreeNode(val,null,null);
            return node;
        }
        
        if( root.val == val ) return root;
        else if( val < root.val ) root.left = insertIntoBST(root.left,val);
        else root.right = insertIntoBST(root.right,val);
        
        return root;
    }
}
