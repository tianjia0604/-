package package1_17;

public class Solution {
    //一、最后一个单词的长度
    //给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
    //如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
    //如果不存在最后一个单词，请返回 0 。
    //方法一
    public static int lengthOfLastWord1(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }
    //方法二
    public static int lengthOfLastWord2(String s) {
        int end = s.length() -1;
        while(end >= 0 && s.charAt(end) == ' ' ) {
            end--;
        }
        if(end < 0) {
            return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
    //二、合并两个有序数组
    //给定两个有序整数数组 nums1 和 nums2，
    // 将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为p2+1
        //System.arraycopy(nums2,0,nums1,0,p2 + 1);
        for(int t = 0;t < p2 + 1;t++) {
            nums1[t] = nums2[t];
        }
    }
}

