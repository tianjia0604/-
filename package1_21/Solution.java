package package1_21;

import java.util.TreeSet;
public class Solution {
    //一、加一
    //给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
    //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    //你可以假设除了整数 0 之外，这个整数不会以零开头。
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1;i >= 0;i--) {
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[len + 1];
        arr[0] = 1;
        return arr;
    }

    //二、第三大的数
    //给定一个非空数组，返回此数组中第三大的数。
    //如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() > 3) {
                //如果有多于三个数字，就把第一个数字删除掉(默认小堆)
                //以确保剩下的三个数字是最大的
                set.remove(set.first());
            }
        }
        return set.size() < 3 ? set.last() : set.first();
    }
}
