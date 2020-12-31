class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] prevColor = new int[n];
        Arrays.fill(prevColor,-1);
        
        for(int i=0; i<n; i++){
            if( prevColor[i] == -1 ){
                if( !isBipartite(graph,i,prevColor) ){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph, int src, int[] prevColor){
        int n = graph.length;
        LinkedList<Integer> que = new LinkedList<>();
        que.addLast(src);
        int color = 0;
        
        while( que.size() != 0 ){
            int size = que.size();
            while( size-- != 0 ){
                int rv = que.removeFirst();
                if( prevColor[rv] != -1 && prevColor[rv] != color ) return false;
                
                prevColor[rv] = color;
                for( int e : graph[rv] ){
                    if(prevColor[e] == -1) que.addLast(e);
                }
            }
            color = (color+1)%2;
        }
        return true;
    }
}
