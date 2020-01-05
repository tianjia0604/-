package package1_5;
//   把字符串转化为整数
//        首先需要判断str是否为空
//        其次需要考虑到str是否有正负符号，这里我使用一个boolean变量isNeg表示，方便最后进行返回值的变换
//        中间我使用Character.isDigit()来判断每个字符是否是数字
//        然后需要考虑int的取值范围，为了确保正确，使用一个double型的变量作为中间变量，最后强转成int作为返回值
//        最后需要判断最后得到的中间变量是否超出int的取值范围
public class Solution {
    public int StrToInt(String str) {
        if (str.length() == 0 || "".equals(str)) {
            return 0;
        }
        boolean isNeg = false;
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        } else if (str.charAt(0) == '-') {
            isNeg = true;
            str = str.substring(1);
        }
        char[] s = str.toCharArray();
        double res = 0;
        for (int i = 0; i < s.length; i++) {
            if (!Character.isDigit(s[i])) {
                return 0;
            } else {
                res += Math.pow(10, s.length - i - 1) * (s[i] - 48);
            }
        }
        if(isNeg==false) {
            if(res>Integer.MAX_VALUE) {
                return 0;
            }else {
                return (int)res;
            }
        }else {
            if((0-res)<Integer.MIN_VALUE) {
                return 0;
            }else {
                return (int)(0-res);
            }
        }
    }
}