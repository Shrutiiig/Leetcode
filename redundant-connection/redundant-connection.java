class Solution {
    int[] par;
    
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        par = new int[n+1];
        for( int i=0; i<=n; i++ ){
            par[i] = i;
        }
        int[] ans = new int[2];
        for( int[] edge : edges ){
            int u = edge[0];
            int v = edge[1];
            
            int par1 = findPar(u);
            int par2 = findPar(v);
            
            if( par1 != par2 ){
                par[par1] = par2;
            }else{
                ans = edge;
                break;
            }
        }
        return ans;
    }
    
    public int findPar( int u ){↔}
}
