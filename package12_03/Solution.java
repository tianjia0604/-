package package12_03;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length <= 0) {
            return 0;
        }
        int prev = array[0];
        int count = 1;
        for(int i= 0;i < array.length;i++) {
            if(array[i] == prev) {
                count++;
            }else {
                count--;
                if(count == 0) {
                    prev = array[i];
                    count = 1;
                }
            }
        }
        int num = 0;
        for(int i = 0;i < array.length;i++) {
            if(array[i] == prev) {
                num++;
            }
        }
        return(num > array.length/2)?prev:0;
    }
}