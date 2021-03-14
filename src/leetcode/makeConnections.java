package leetcode;

import java.util.Scanner;

public class makeConnections {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = 4;
        int[][] connections = {{0,1}, {0,2}, {1,2}};



    }
    int[] a;
    int count;
    int c;
    public int makeConnected(int n, int[][] connections) {
        a = new int[n];
        int endpoint = n-1;
        for(int i = 0; i < a.length; i++) {
            a[i] = -1;
        }
        for(int i = 0; i < connections.length; i++) {
            union(connections[i][0], connections[i][1]);
        }
        int b = endpoint - count;
        if(c >= b) {
            // checking if all the comps. are connected
            return b;
        }
        else {
            return -1;
        }
    }
    public void union(int point1, int point2) {
        int find1 = find(point1);
        int find2 = find(point2);
        if(find1 != find2) {
            count++;
            a[find1] = find2;
            //joining subsets
        }
        else {
            c++;
        }
    }

    public int find(int p) {
        if(a[p] == -1) {
            return p;
        }
        return find(a[p]);
    }
}
