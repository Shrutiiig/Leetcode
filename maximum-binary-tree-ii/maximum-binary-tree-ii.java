/*↔*/
class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if( root == null ) return node;
        
        if( val >= root.val ){
            node.left = root;
            return node;
        }
        root.right = insertIntoMaxTree(root.right,val);
        return root;
    }
}
