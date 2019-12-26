package package12_26;

public class Solution {
// 求1+2+3+...+n，
// 要求不能使用乘除法、for、while、if、else、switch、case等关键字
// 及条件判断语句（A?B:C）。
    //方法一
    //1.需利用逻辑与的短路特性实现递归终止。
    // 2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)
    // 只执行前面的判断，为false，然后直接返回0；
    // 3.当n>0时，执行sum+=Sum_Solution(n-1)，
    // 实现递归计算Sum_Solution(n)。
    public int Sum_Solution1(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution1(n-1))>0);
        return sum;
    }



    //方法二
    //这是一个等差数列，
    // sum=(a1+an)n/2=>(1+n)n/2=>(n+n^2)/2；Math.pow(a,b)表示a^b；
    // 右移一位相当于除以2。
    public int Sum_Solution2(int n) {
        int sum = (int)Math.pow(n,2) + n;
        return sum >> 1;

    }

}