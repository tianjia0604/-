package package1_16;

public class Solution {
    //一、赎金信
    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
    //判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
    //如果可以构成，返回 true ；否则返回 false。
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] x=  new int[26];
        int[] y = new int[26];
        for (int i : ransomNote.toCharArray())
            x[i-'a'] ++;
        for (int i : magazine.toCharArray())
            y[i-'a'] ++;
        for (int i = 0; i < 26; i++)
            if (x[i] > y[i])
                return false;
        return true;
    }
    //二、回文数
    //12321
    public boolean isPalindrome(int x) {
        //负数、以0结尾除0外都不是
        if(x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int reverseNum = 0;
        while( x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        //偶数位对称 奇数位去掉中间一位
        return x == reverseNum || x == reverseNum / 10;
    }

}
