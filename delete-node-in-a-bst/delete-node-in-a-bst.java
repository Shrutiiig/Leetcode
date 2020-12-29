class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if( root == null ) return null;
        
        if( root.val == key ){
​
            if( root.left == null || root.right == null ) return root.left != null ? root.left : root.right;
            
            TreeNode t = root;
            //Find the node with min value(that will be the successor) in right sub tree
            //We will replace the node to be deleted with this node
            root = findMin(t.right);
​
            //Delete that successor node from the orignal sub tree and update the links
            root.right = deleteMin(t.right);
​
            //Left subtree remains the same
            root.left = t.left;
        }
        else if( root.val > key ){
            root.left = deleteNode(root.left,key);
        }
        else{
            root.right = deleteNode(root.right,key);
        }
        
        return root;
    }
    
    public TreeNode findMin(TreeNode root){
        if(root.left == null) return root;
        else return findMin(root.left);
    }
    
    private TreeNode deleteMin(TreeNode node) {
        if (node.left == null) return node.right;
        node.left = deleteMin(node.left);
        return node;
    }
}
