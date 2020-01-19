package package1_19;

import java.util.Arrays;
public class Solution {
    //一、有序数组的平方
    //给定一个按非递减顺序排序的整数数组 A，
    //返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
    //方法一
    public int[] sortedSquares1(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    //方法二
    public int[] sortedSquares2(int[] A) {
        int start = 0;
        int end = A.length;
        int i = end - 1;
        int[] nums = new int[end--];
        while (i >= 0) {
            nums[i--] = A[start] * A[start] >= A[end] * A[end] ? A[start] * A[start++] : A[end] * A[end--];
        }
        return nums;
    }

    //二、仅仅反转字母
    //给定一个字符串 S，返回 “反转后的” 字符串，
    //其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
    public static String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j))) {
                    j--;
                }
                sb.append(S.charAt(j--));

            } else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}


