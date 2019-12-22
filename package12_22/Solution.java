package package12_22;

import java.util.Arrays;
public class Solution {
    //统计一个数字在排序数组中出现的次数。


    //方法一
    public int GetNumberOfK1(int [] array , int k) {
        int index = Arrays.binarySearch(array,k);
        if(index < 0) {
            return 0;
        }
        int count = 1;
        for(int i = index + 1;i < array.length
                && array[i] == k;i++) {
            count++;
        }
        for(int i = index - 1;i >= 0 && array[i] == k;i--) {
            count++;
        }
        return count;
    }



    //方法二
    public int GetNumberOfK2(int [] array , int k) {
        int length = array.length;
        if(length == 0){
            return 0;
        }
        int firstK = getFirst(array,k,0,length - 1);
        int lastK = getLast(array,k,0,length - 1);
        return lastK - firstK + 1;
    }
    //获取k第一次出现的下标
    private int getFirst(int[] data,int k,int start,int end){
        int mid = (start + end)/2;
        while(start <= end){
            if(data[mid] < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = (start + end)/2;
        }
        return start;
    }
    //获取k最后一次出现的下标
    private int getLast(int[] data,int k,int start,int end){
        int mid = (start + end)/2;
        while(start <= end){
            if(data[mid] <= k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = (start + end)/2;
        }
        return end;
    }
}