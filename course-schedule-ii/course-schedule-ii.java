class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int[] ans = new int[n];
        ArrayList<Integer>[] graph = new ArrayList[n];
        for( int i=0; i<n; i++ ) graph[i] = new ArrayList<>();
        LinkedList<Integer> que = new LinkedList<>();
        int[] indegree = new int[n];
        
        for( int[] edge : prerequisites ){
            int u = edge[0];
            int v = edge[1];
            indegree[v]++;
            graph[u].add(v);
        }
        
        for( int i=0; i<n; i++ ){
            if( indegree[i] == 0 ) que.addLast(i);
        }
        int idx=n-1;
        while( que.size() != 0 ){
            int rv = que.removeFirst();
            ans[idx--] = rv;
            
            for( int e : graph[rv] ){
                --indegree[e];
                if( indegree[e] == 0 ) que.addLast(e);
            }
        }
        if( idx != -1 ) return new int[0];
        return ans;
    }
}
