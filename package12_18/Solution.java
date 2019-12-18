package package12_18;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input == null || input.length == 0 || input.length < k || k == 0) {
            return new ArrayList<>();
        }
        int start = 0;
        int end = input.length - 1;
        int index = partition(input,start,end);
        while(index != k - 1) {
            if(index < k - 1) {
                start = index + 1;
            }else {
                end = index - 1;
            }
            index = partition(input,start,end);
        }
        ArrayList list = new ArrayList<>();
        for(int i = 0;i <= index; i++) {
            list.add(input[i]);
        }
        return list;
    }

    private int partition(int[] arr, int start, int end) {
        swap(arr, start + (int) Math.random() * (end - start + 1), end);
        int smaller = start - 1;
        while (start < end) {
            if (arr[start] < arr[end]) {
                swap(arr, ++smaller, start++);
            } else {
                start++;
            }
        }
        swap(arr, ++smaller, end);
        return smaller;
    }


    private void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;

    }
}
