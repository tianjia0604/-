package package3_13;

public class Main6 {
    public static int minNumberInRotateArray(int [] array) {
        if(array.length == 1) {
            return array[0];
        }
        int left = 0;
        int mid = 0;
        int right = array.length - 1;
        while(left < right) {
            if(array[left] < array[right])
                return array[left];
            mid = left + (right - left)/2;
            if(array[mid] > array[left]) {
                left = mid + 1;
            }else if(array[mid] < array[right]) {
                right = mid;
            }else {
                left++;
            }
        }
        return array[left];
    }

    public static void main(String[] args) {
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(array1));
        int[] array2 = {1, 0, 1, 1, 1};
        System.out.println(minNumberInRotateArray(array2));
    }
}