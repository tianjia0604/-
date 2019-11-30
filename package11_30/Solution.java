package package11_30;

public class Solution{
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean ret = false;
        if(root1 != null && root2 != null) {
            if(root1.val == root2.val) {
                ret =isSametree(root1,root2);
            }
            if(!ret) {
                ret = HasSubtree(root1.left,root2);
            }
            if(!ret) {
                ret = HasSubtree(root1.right,root2);
            }
        }
        return ret;
    }

    public boolean isSametree(TreeNode root1,TreeNode root2){
        if(root2==null)
            return true;
        if(root1 == null)
            return false;
        if(root1.val != root2.val)
            return false;
        return isSametree(root1.left,root2.left) && isSametree(root1.right,root2.right);
    }

}
