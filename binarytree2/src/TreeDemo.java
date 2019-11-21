import java.util.ArrayList;
import java.util.List;
public class TreeDemo {
    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return result;
        }
        helper(root,0);
        return result;
    }
    public void helper(TreeNode root,int leval) {
        if(leval == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(leval).add(root.val);
        if (root != null) {
            helper(root.left,leval + 1);
            helper(root.right,leval + 1);
        }
    }
    private TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        findNode(root,p,q);
        return lca;
    }
    private boolean findNode(TreeNode root, TreeNode p,TreeNode q) {
        if(root == null) {
            return false;
        }
        int left = findNode(root.left, p, q) ? 1 : 0;
        int right = findNode(root.right, p, q) ? 1 : 0;
        int mid = (root == p || root == q) ? 1 : 0;
        if(left + right + mid >= 2) {
            lca = root;
        }
        return (left + right + mid) > 0;
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
            return null;
        }
        if(pRootOfTree.left == null && pRootOfTree.right == null){
            return pRootOfTree;
        }
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode leftTail = left;
        while(leftTail != null && leftTail.right != null) {
            leftTail = leftTail.right;
        }
        if(left != null) {
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if(right != null) {
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return left == null ? pRootOfTree : left;
    }
    private int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return buildTreeHelper(preorder,inorder,0,inorder.length);
    }
    private TreeNode buildTreeHelper(int[] preorder,int[] inorder,
                                     int inorderLeft,int inorderRight) {
        if(inorderLeft >= inorderRight) {
            return null;
        }
        if(index >= preorder.length) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        index++;
        int pos = find(inorder,inorderLeft,inorderRight,root.val);
        root.left = buildTreeHelper(preorder,inorder,inorderLeft,pos);
        root.right = buildTreeHelper(preorder,inorder,pos+1,inorderRight);
        return root;
    }
    private int find(int[] inorder,int inorderLeft,int inorderRight,int val) {
        for(int i = inorderLeft;i < inorderRight;i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }
    private StringBuilder stringBuilder = new StringBuilder();
    public String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }
        tree2strHelper(t);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
    private void tree2strHelper(TreeNode root) {
        if(root == null) {
            return;
        }
        stringBuilder.append("(");
        stringBuilder.append(root.val);
        tree2strHelper(root.left);
        if(root.left == null && root.right != null) {
            stringBuilder.append("()");
        }
        tree2strHelper(root.right);
        stringBuilder.append(")");
    }
}
