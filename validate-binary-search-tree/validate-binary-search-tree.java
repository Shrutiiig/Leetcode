/*↔*/
class Solution {
    public boolean isValidBST(TreeNode root){↔}
    
    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if( root == null ) return true;
        
        int val = root.val;
        if( min != null && min >= val ) return false;
        if( max != null && max <= val ) return false;
        
        return isValidBST(root.left,min,val) && isValidBST(root.right,val,max);
    }
}
