

import java.util.Arrays;
// public class Test{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};
//         String newArr=Arrays.toString(arr);
//         System.out.println(newArr);
//     }
// }
// 拷贝
// public class Test{
//     public static void main(String[] args) {
//         int[] arr ={1,2,3,4,5,6};
//         int[] newArr=Arrays.copyOf(arr,arr.length);
//         System.out.println("newArr"+Arrays.toString(newArr));
//     }
// }
// 求最大
// public class Test{
//     public static void main(String[] args) {
//         int[] arr = {9, 5, 2, 7};
//         System.out.println(max(arr));
//     }
//     public static int max(int[] arr) {
//         int max = arr[0];
//         for(int i = 0;i < arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }
// 平均值
// public class Test{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};
//         System.out.println(avg(arr));
//     }
//     public static double avg(int[] arr){
//         int sum = 0;
//         for(int x : arr){
//             sum += x;
//         }
//         return (double)sum/(double)arr.length;
//     }
// }
// 顺序查找
// public class Test{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};
//         System.out.println(Find(arr,5));
//     }
//     public static int Find(int[] arr,int tofind) {
//         for(int i= 0;i <arr.length;i++){
//             if(arr[i]==tofind){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
// 二分查找
// public class Test{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};
//         System.out.println(binarySearch(arr,3));
//     }
//     public static int binarySearch(int[] arr,int tofind) {
//         int left = 0;
//         int  right = arr.length - 1;
//         while(left <= right){
//             int mid =(left + right)/2;
//             if(arr[mid] < tofind){
//                 left = mid + 1;
//             }
//             else if(arr[mid] > tofind){
//                 right = mid - 1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }
// 检查数组有序性
// public class Test{
//     public static void main(String[] args) {
//         int[] arr = {9,5,2,7};
//         System.out.println(isSorted(arr));
//     }
//     public static boolean isSorted(int[] arr){
//         for(int i = 0;i < arr.length-1; i++){
//             if(arr[i] > arr[i + 1]){
//                 return false;
//             }            
//         }
//         return true;
//     }
// }

import java.util.Arrays;
public class Test{
    public static void main(String[] args) {
        int[] arr={9,5,2,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for(int bound = 0;bound < arr.length;bound++){
            for(int i = arr.length-1;i > bound;i--){
                if(arr[i-1]>arr[i]){
                    int tmp = arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=tmp;
                }
            }
        }
    }
}





