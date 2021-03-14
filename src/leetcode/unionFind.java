//package leetcode;
//
//public class unionFind {
//    public static void main(String[] args) {
//
//    }
//    public int findCircleNum(int[][] isConnected){
//        UF uf = new UF(isConnected.length);
//        int[] a = new int[isConnected.length];
//        for(int i = 0; i < isConnected.length; i++) {
//            a[i] = i;
//        }
//        for(int i = 0; i < isConnected.length; i++) {
//            for(int j = i + 1; j < isConnected.length; j++) {
//                if(uf.find(a[j], i) != uf.find(a[j], j)) {
//                    a[]
//                }
//            }
//        }
//    }
//}

class UF {
    private int[] id;
    private int[] size;
    // O(n)
    public UF(int n) {
        id = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }
    // O(1) since log*n <= 5 if n = 2^65536
    private int root(int i) {
        while (i != id[i]) {
            id[i] =  id[id[i]]; // path compression
            i = id[i];
        }
        return i;
    }
    // O(1)
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) { return; }
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        } else {
            id[j] = i;
            size[i] += size[j];
        }
    }
    // O(1)
    public boolean find(int p, int q) {
        return root(p) == root(q);
    }
}
