package package1_23;

public class Solution {
    public int myAtoi(String str) {
        int rev = 0;
        char[] charList = str.toCharArray();
        int length = str.length();
        int zf = 1;
        int i = 0;
        int pop = 0;
        for(;  i < length; i++){
            if(charList[i] == ' '){
                continue;
            }else{
                if(charList[i] == '-'){
                    i++;
                    zf = -1;
                    break;
                }
                if(charList[i] == '+'){
                    i++;
                    break;
                }
                if(charList[i] <'0' || charList[i] >'9'){
                    return 0;
                }else{
                    break;
                }
            }
        }
        if(i == length){
            return 0;
        }
        for(;i < length; i++){
            if(charList[i] <'0' || charList[i] >'9'){
                return rev;
            }
            pop = (charList[i] -48) * zf;
            if(rev>Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                return Integer.MAX_VALUE;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
                return Integer.MIN_VALUE;
            }
            rev = rev * 10 + pop;
        }
        return rev;

    }
}
