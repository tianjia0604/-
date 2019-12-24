package package12_24;
//输入一个递增排序的数组和一个数字S，
// 在数组中查找两个数，使得他们的和正好是S，
// 如果有多对数字的和等于S，输出两个数的乘积最小的
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length == 0)
            return list;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int total = array[left] + array[right];
            if (total == sum) {
                list.add(array[left]);
                list.add(array[right]);
                return list;
            } else if (total > sum) {
                //大于sum，说明太大了，right左移寻找更小的数
                --right;
            } else {
                //2.如果和小于sum，说明太小了，left右移寻找更大的数
                ++left;
            }
        }
        return list;
    }
}