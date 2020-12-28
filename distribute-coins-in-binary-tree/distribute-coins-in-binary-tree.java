/*↔*/
class Solution {
    
    int ans = 0;
    public int distributeCoins(TreeNode root) {↔}
    
    public int distributeCoins_(TreeNode root) {
        if( root == null ) return 0;
        //if( root.val == 0 ) return -1;
        
        int lans = distributeCoins_(root.left);
        int rans = distributeCoins_(root.right);
        
        ans += Math.abs(lans) + Math.abs(rans);
        return root.val - 1 + lans + rans;
    }
}
