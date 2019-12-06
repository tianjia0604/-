package package12_06;

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
    ArrayList<TreeNode> list = new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        addNode(pRoot);
        if(k >= 1 && list.size() >= k) {
            return list.get(k -1);
        }
        return null;
    }
    void addNode(TreeNode cur) {
        if(cur!= null) {
            addNode(cur.left);
            list.add(cur);
            addNode(cur.right);
        }
    }


}