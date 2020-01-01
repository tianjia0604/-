package package1_1;
//从上到下按层打印二叉树
// 同一层结点从左至右输出。每一层输出一行。
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
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        dfs(pRoot, 0, lists);
        return lists;
    }
    private void dfs(TreeNode pRoot, int deep, ArrayList<ArrayList<Integer>> lists) {
        if (pRoot == null) {
            return;
        }
        if (deep >= lists.size()) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(pRoot.val);
            lists.add(list);
        } else {
            ArrayList<Integer> list = lists.get(deep);
            list.add(pRoot.val);
        }
        dfs(pRoot.left, deep + 1, lists);
        dfs(pRoot.right, deep + 1, lists);
    }


}
