/*↔*/
class Solution {
    public int countNodes(TreeNode root) {
        if( root == null ) return 0;
        
        int height = height(root);
        
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        int count = 0;
        int level = 1;
        while( que.size() != 0 ){
            int size = que.size();
            while( size-- != 0 ){
                TreeNode rv = que.removeFirst();
                System.out.println(rv.val + " ==> " + level);
                if( level == height ){
                    count++;
                }
                if( rv.left != null && rv.right != null ){
                    count++;
                    que.addLast(rv.left);
                    que.addLast(rv.right);
                }
                if( (level == height - 1) && (rv.left == null || rv.right == null) ){
                    count++;
                    if(rv.left != null) que.addLast(rv.left);
                    if(rv.right != null) que.addLast(rv.right);
                }
                
            }
            ++level;
        }
        return count;
    }
    
    public int height(TreeNode root){↔}
}
