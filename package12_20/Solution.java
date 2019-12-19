package package12_20;
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null)
            return 0;
        int sum = array[0];
        int tmpSum = array[0];
        for(int i = 1;i < array.length;i++) {
            tmpSum = (tmpSum < 0) ? array[i] : tmpSum + array[i];
            sum = (tmpSum > sum) ? tmpSum : sum;
        }
        return sum;
    }
}