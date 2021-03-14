package Arrays.CCC.CCC2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// how to reset the tree to the very beginning to find the next letter

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

public class S2_2017 {
    public StringBuilder main(TreeNode root) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner b = new Scanner(System.in);
        String sequence = b.next();
        StringBuilder d = new StringBuilder();
        helper(root, sequence, a);
        for(int i = 0; i < a.size(); i++) {
            d.append(a.get(i));
        }
        return d;
    }

    private int count = 0;
    private void helper(TreeNode root, String sequence, ArrayList<String> a) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "00");
        map.put("B", "01");
        map.put("C", "10");
        map.put("D", "110");
        if(root.left == null && root.right == null) {
            for(int j = 0; j < map.size(); j++) {
                if(sequence.substring(0, count).equals(map.get(j))){
                    a.add(map.get(j));
                    break;
                }
            }
            helper(root, sequence, a);
        }
        if(sequence.substring(count, count+1).equals("0")) {
            if(root.left != null) {
                count++;
                helper(root.left, sequence, a);
            }
        }
        if(sequence.substring(count, count+1).equals("1")) {
            if(root.right != null) {
                count++;
                helper(root.right, sequence, a);
            }
        }
    }
}
