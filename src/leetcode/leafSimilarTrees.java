package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
class TreeNode {
    int val;
      TreeNode left;
        TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
 }
}
//3, 5, 1, 6, 2, 9, 8, null, null, 7, 4
//3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8
public class leafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode(3);
        root1.right = root2;

        System.out.println(leafSimilar(root1, root2));
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
       ArrayList<Integer> leaf1 = new ArrayList<>();
       ArrayList<Integer> leaf2 = new ArrayList<>();
       if(root1 == null || root2 == null){
           return true;
       }
       dfs(root1, leaf1);
       dfs(root2, leaf2);
       if(leaf1.size() != leaf2.size()) {
           return false;
       }
       for(int i = 0; i < leaf1.size(); i++) {
           if(leaf1.get(i) != leaf2.get(i)) {
               return false;
           }
       }
       return true;
    }

    public static void dfs(TreeNode a, ArrayList<Integer> leaf){
        if(a == null) {
            return;
        }
        if(a.left == null && a.right == null) {
            leaf.add(a.val);
        }
        dfs(a.left, leaf);
        dfs(a.right, leaf);
    }
}
