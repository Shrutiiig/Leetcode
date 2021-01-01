/*↔*/
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if( root == null ) return false;
        
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        int level = 1;
        Integer prev = null;
        
        while( que.size() != 0 ){
            int size = que.size();
            while( size-- != 0 ){
                TreeNode rv = que.removeFirst();
                System.out.println( rv.val + " " + level );
                if( level % 2 == 0 ){
                    if( rv.val % 2 != 0 || (prev != null && rv.val >= prev) ) return false;
                }else{
                    if( rv.val % 2 == 0 || (prev != null && rv.val <= prev) ) return false;
                }
                prev = rv.val;
                if( rv.left != null ) que.addLast( rv.left );
                if( rv.right != null ) que.addLast( rv.right );
            }
            prev = null;
            level++;
        }
        return true;
    }
}
