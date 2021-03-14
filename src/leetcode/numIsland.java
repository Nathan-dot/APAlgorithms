package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class numIsland {
    public static void main(String[] args) {
        char[][] a = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(a));

    }

    public static int numIslands(char[][] grid) {
        int a = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    a++;
                    dfs(i, j, grid);
                }
            }
        }
        return a;
    }

    public static void dfs(int i, int j, char[][] grid) {
        if(i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] != '1') {
            return;
        }
        else if(grid[i][j] == '1') {
            grid[i][j] = '2';
        }
        dfs(i+1, j, grid);
        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i, j-1, grid);
    }
}
