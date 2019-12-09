package package12_09;

public class Solution {
    public int NumberOf1Between1AndN_Solution1(int n) {
        int count = 0;
        while(n > 0) {
            String str = String.valueOf(n);
            char[] chars = str.toCharArray();
            for(int i = 0; i < chars.length;i++) {
                if(chars[i] == '1') {
                    count++;
                }
            }
            n--;
        }
        return count;
    }
    //优化  时间复杂度O(lonN)
    public int NumberOf1Between1AndN_Solution2(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m;
            int b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }
}