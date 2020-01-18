package package1_18;
import java.util.Arrays;

public class Solution {
    //一、存在重复元素
    //给定一个整数数组，判断是否存在重复元素。
    //如果任何值在数组中出现至少两次，函数返回 true。
    // 如果数组中每个元素都不相同，则返回 false。
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i < nums.length -1;i++) {
            if(nums[i + 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
    //二、长按键入
    //你的朋友正在使用键盘输入他的名字 name。
    // 偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
    //你将会检查键盘输入的字符 typed。
    // 如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），
    // 那么就返回 True

    public boolean isLongPressedName(String name, String typed) {
        int len1 = name.length();
        int len2 = typed.length();
        if(len1 > len2) {
            return false;
        }
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2) {
            if(name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }else {
                return false;
            }
        }
        return i == len1;
    }
}
