class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++) graph[i] = new ArrayList<>();
        LinkedList<Integer> que = new LinkedList<>();
        
        int[] indegree = new int[n];
        for( int[] edge : prerequisites ){
            int u = edge[0];
            int v = edge[1];
            
            indegree[v]++;
            graph[u].add(v);
        }
        int count = 0;
        
        for( int i=0; i<n; i++ ) if( indegree[i] == 0 ) que.addLast(i);
        
        while( que.size() != 0 ){
            int rv = que.removeFirst();
            count++;
            for( int j : graph[rv] ){
                --indegree[j];
                if( indegree[j] == 0 ) que.addLast(j);
            }
        }
        
        return count == n;
