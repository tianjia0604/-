package package2_1;


public class Solution {
    //整数翻转
    public int reverse(int x) {
        int ret = 0;
        while(x != 0) {
            int temp = ret * 10 + x % 10;
            //判断溢出
            if(temp / 10 != ret) {
                return 0;
            }
            ret = temp;
            x /= 10;
        }
        return ret;
    }
    //最长公共前缀
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String arr = strs[0];
        for(int i = 1;i < strs.length;i++) {
            while(strs[i].indexOf(arr) != 0) {
                arr = arr.substring(0,arr.length() - 1);
                if(arr.isEmpty()) {
                    return "";
                }
            }
        }
        return arr;
    }
}
