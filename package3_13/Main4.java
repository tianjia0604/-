package package3_13;

import java.util.Arrays;
public class Main4 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }

    }
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0) {
            return null;
        }
        if(pre.length != in.length)
            new Exception("前中序长度不同，请重新输入");
        TreeNode root = new TreeNode(pre[0]);

        for(int i = 0;i < in.length;i++) {
            if(in[i] == pre[0]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i +1),
                        Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i + 1,pre.length),
                        Arrays.copyOfRange(in,i + 1,in.length));
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] mid = {4,7,2,1,5,3,8,6};
        System.out.println(reConstructBinaryTree(pre,mid));
    }
}