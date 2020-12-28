/*↔*/
class Solution {
    public void flatten(TreeNode root) {
        
        if( root == null ) return;
        
        flatten(root.left);
        flatten(root.right);
        
        TreeNode rightNode = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode node = getNextRightNode(root);
        node.right = rightNode;
        
    }
    
    public TreeNode getNextRightNode(TreeNode root){↔}
}
