package leetcode;

public class redundantConnection {
    int [] parent;
    public int findPar(int a){
        if(parent[a] == a){
            return a;
        }
        int temp = findPar(parent[a]);
        parent[a] = temp;
        return temp;
    }
    public int[] findRedundantConnection(int[][] edges) {
        if(edges.length == 0 || edges[0].length == 0) {
            return new int[0];
        }
        int n = edges.length;
        int m = edges[0].length;
        parent = new int[n+1];
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
        int[] ans = new int[2];
        for(int[] a : edges){
            int u = a[0];
            int v = a[1];
            int b = findPar(u);
            int c = findPar(v);
            if(b == c){
                ans[0] = u;
                ans[1] = v;
                return ans;
            }
            parent[c] = b;
        }
        return new int[0];
    }
}
