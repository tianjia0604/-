package package12_05;

import java.util.ArrayList;
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root == null) {
            return list;
        }
        queue.add(root);
        while(queue.size() != 0) {
            TreeNode treenode = queue.remove(0);
            if(treenode.left != null) {
                queue.add(treenode.left);
            }
            if(treenode.right != null) {
                queue.add(treenode.right);
            }
            list.add(treenode.val);
        }
        return list;
    }
}