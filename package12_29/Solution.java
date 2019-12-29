package package12_29;
//写一个函数，求两个整数之和，
// 要求在函数体内不得使用+、-、*、/四则运算符号。
public class Solution {
    public int Add(int num1,int num2) {
        int result, ans;
        do {
            result = num1 ^ num2;       // 每一位相加
            ans = (num1 & num2) << 1;   // 进位
            num1 = result;
            num2 = ans;
        } while (ans != 0);
        return result;
    }
}