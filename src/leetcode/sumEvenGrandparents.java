package leetcode;

public class sumEvenGrandparents {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(null, null, root);
        return sum;
    }

    public void dfs(TreeNode grandParent, TreeNode parent, TreeNode root) {
        if(root == null) {
            return;
        }
        if(grandParent != null && grandParent.val % 2 == 0) {
           sum += root.val;
        }
        dfs(parent, root, root.right);
        dfs(parent, root, root.left);
    }
}
