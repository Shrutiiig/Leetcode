/*↔*/
​
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if( root == null ) return res;
        
        LinkedList<Node> que = new LinkedList<>();
        que.addLast(root);
        int level = 0;
        while( que.size() != 0 ){
            int size = que.size();
            res.add(new ArrayList<>());
            while( size-- > 0 ){
                
                Node rvtx = que.removeFirst();
                res.get(level).add(rvtx.val);
                
                for( Node child : rvtx.children ){
                    que.addLast(child);
                }
            }
            level++;
            
        }
        
        return res;
    }
}
