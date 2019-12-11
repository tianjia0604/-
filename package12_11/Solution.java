package package12_11;

public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) {
            return true;
        }
        return helpisSymmetrical(pRoot.left,pRoot.right);
    }
    boolean helpisSymmetrical(TreeNode node1,TreeNode node2) {
        if(node1 == node2) {
            return true;
        }
        else if(node1 == null || node2 == null) {
            return false;
        }
        if(node1.val != node2.val) {
            return false;
        }
        return helpisSymmetrical(node1.left,node2.right) && helpisSymmetrical(node1.left,node2.right);
    }
}
