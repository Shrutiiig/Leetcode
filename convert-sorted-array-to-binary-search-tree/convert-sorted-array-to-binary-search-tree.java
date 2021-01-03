/*↔*/
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if( nums.length == 0 ) return null;
        
        return helper( nums,0,nums.length-1 );
    }
    
    public TreeNode helper(int[] nums, int si, int ei){
        if( si>ei ) return null;
        int mid = (si + ei)/2;
        TreeNode root = new TreeNode( nums[mid] );
        
        root.left = helper( nums,si,mid-1 );
        root.right = helper( nums,mid+1,ei );
        
        return root;
    } 
}
