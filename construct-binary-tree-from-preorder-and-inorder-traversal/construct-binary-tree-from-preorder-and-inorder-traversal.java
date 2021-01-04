/*↔*/
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if( inorder.length == 0 ) return null;
        return buildTree( preorder,inorder,0,inorder.length-1 );
    }
    int i=0;
    public TreeNode buildTree(int[] preorder, int[] inorder, int min, int max) {
        if( min > max ) return null;
        
        int idx = findIdx_in_inorder( inorder,preorder[i] );
        TreeNode root = new TreeNode( preorder[i++] );
        
        root.left = buildTree( preorder,inorder,min,idx-1 );
        root.right = buildTree( preorder,inorder,idx+1,max );
        
        return root;
    }
    
    public int findIdx_in_inorder(int[] inorder,int data) {↔}
}
