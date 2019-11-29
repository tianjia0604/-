package package11_29;
public class Solution {
    //递归版本
    public int RectCover1(int target) {
        if(target <= 2) {
            return target;
        }else{
            return RectCover1(target - 1)+ RectCover1(target - 2);
        }
    }
    //非递归版本
    public int RectCover2(int target) {
        if(target <= 2) {
            return target;
        }
        int a = 2;
        int b = 1;
        for(int i = 3;i <= target;i++) {
            int cur = a + b;
            b = a;
            a = cur;
        }
        return a;
    }
}
