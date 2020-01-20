package package1_20;

public class Solution {
    //一、按奇偶排序数组
    //给定一个非负整数数组 A，返回一个数组，
    //在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
    //你可以返回满足此条件的任何数组作为答案
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int left = 0;
        int right = A.length - 1;
        for(int i = 0;i < A.length;i++) {
            if(A[i] % 2 == 0) {
                B[left] = A[i];
                left++;
            }else {
                B[right] = A[i];
                right--;
            }
        }
        return B;
    }
    //二、寻找数组中的中心索引
    //我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
    //如果数组不存在中心索引，那么我们应该返回 -1。
    // 如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int num : nums) sum += num;
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] == leftSum * 2) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
