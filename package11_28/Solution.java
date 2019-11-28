package package11_28;
public class Solution {
    public void reOrderArray(int [] array) {
        int len = array.length;
        if(len <= 1) {
            return;
        }
        int i = 0;
        while(i < len) {
            if(array[i] % 2 == 1) {
                i++;
            }else {
                int j = i + 1;
                while(array[j] % 2 == 0){
                    if(j == len - 1) {
                        return;
                    }
                    j++;
                }
                int tmp = array[j];
                while(j > i) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[i] = tmp;
            }
        }
    }
}