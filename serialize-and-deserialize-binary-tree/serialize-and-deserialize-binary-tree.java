/*↔*/
public class Codec {
​
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        int height = height(root);
        
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        int level = 1;
        while( que.size() != 0 ){
            int size = que.size();
            while(size-- != 0){
                TreeNode rvtx = que.removeFirst();
                if( rvtx != null ) sb.append( String.valueOf(rvtx.val) + "," );
                else sb.append( "null" + "," );
                
                if( level != height && rvtx != null ){
                    if( rvtx.left != null ) que.addLast(rvtx.left);
                    else que.addLast(null);
                    
                    if( rvtx.right != null ) que.addLast(rvtx.right);
                    else que.addLast(null);
                }
            }
            level++;
        }
        System.out.println(sb.toString());
        return sb.toString();
        
    }
​
    public int height(TreeNode root){
        return (root == null) ? 0 : Math.max( height(root.left), height(root.right) ) + 1;
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] node = data.split(",");
        if (node[0].equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(node[0]));
