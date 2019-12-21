package package12_21;

public class Solution {
    // 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
    // 例如6、8都是丑数，但14不是，因为它包含质因子7。
    // 习惯上我们把1当做是第一个丑数。
    // 求按从小到大的顺序的第N个丑数。
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0) {
            return 0;
        }
        int p2 = 0,p3 = 0,p5 = 0;
        int[] result = new int[index];
        result[0] = 1;
        for(int i = 1; i < index;i++) {
            result[i] = Math.min(result[p2]*2,Math.min(result[p3]*3,result[p5]*5));
            if(result[i] == result[p2]*2){
                p2++;
            }
            if(result[i] == result[p3]*3){
                p3++;
            }
            if(result[i] == result[p5]*5){
                p5++;
            }
        }
        return result[index - 1];
    }
    //在一个字符串(0<=字符串长度<=10000，全部由字母组成)中
    // 找到第一个只出现一次的字符,并返回它的位置,
    // 如果没有则返回 -1（需要区分大小写）.
    public int FirstNotRepeatingChar(String str) {
        for(int i = 0;i < str.length();i++) {
            char a = str.charAt(i);
            if(str.indexOf(a) == i && str.lastIndexOf(a) == i) {
                return i;
            }
        }
        return -1;
    }
}