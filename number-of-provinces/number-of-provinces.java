class Solution {
    int[] par;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        par = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
        }
        int ans = n;
        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++ ){
                if( isConnected[i][j] == 1 ){
                    int p1 = findPar(i);
                    int p2 = findPar(j);
                    isConnected[j][i] = 0;
                    
                    if( p1 != p2 ){
                        par[p1] = p2;
                        ans--;
                    }
                }
            }
        }
        return ans;
    }
    
    public int findPar( int p1 ){
        if( par[p1] == p1 ) return p1;
        return findPar(par[p1]);
    }
}
