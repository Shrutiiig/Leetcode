/*↔*/
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder, int low, int high) {
        
        if( idx >= preorder.length || preorder[idx] < low || preorder[idx] > high ) return null;
        
        TreeNode node = new TreeNode(preorder[idx++]);
        node.left = bstFromPreorder(preorder,low,node.val);
        node.right = bstFromPreorder(preorder,node.val,high);
        
        return node;
    }
}
