/*↔*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if( root == null ) return list;
        
        preorderTraversal_(root,list);
        return list;
    }
    
    public void preorderTraversal_(TreeNode root,List<Integer> list ){
        if( root == null ) return;
        
        list.add(root.val);
        preorderTraversal_(root.left,list);
        preorderTraversal_(root.right,list);
    }
}
