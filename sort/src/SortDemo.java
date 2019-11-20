import java.util.Arrays;
import java.util.Stack;

public class SortDemo {
    //冒泡排序
    public static void bubbleSort(int[] array) {
        for(int bound = 0;bound <= array.length;bound++) {
            for(int cur = array.length - 1;cur > bound;cur--) {
                if(array[cur - 1] > array[cur]) {
                    swap(array,cur - 1,cur);
                }
            }
        }
    }
    //快速排序
    public static void quickSort(int[] array) {
        quickSortHelper(array,0,array.length - 1);
    }
    private static void quickSortHelper(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        int index = partition(array,left,right);
        quickSortHelper(array,left,index - 1);
        quickSortHelper(array,index + 1,right);
    }
    private static int partition(int[] array,int left,int right) {
        int baseIndex = right;
        int baseValue = array[baseIndex];
        while(left < right) {
            while(left < right && array[left] <= baseValue) {
                left++;
            }
            while(left < right && array[right] >= baseValue) {
                right--;
            }
            swap(array,left,right);
        }
        swap(array,left,baseIndex);
        return left;
    }
    //非递归版本的快速排序
    public static void quickSortByLoop(int[] array) {
        //1.先创建一个栈，栈里面存的是待处理区间的下标
        Stack<Integer> stack = new Stack<>();
        //2.初始情况下待处理区间，就是整个数组
        stack.push(array.length-1);
        stack.push(0);
        while(!stack.isEmpty()) {
            //3.取栈顶元素，栈顶元素就是我们要处理的区间
            int left = stack.pop();
            int right = stack.pop();
            if(left >= right) {
                continue;
            }
            //4.对当前区间进行处理
            int index = partition(array,left,right);
            //5.接下来对要处理的区间再入栈
            //[left,index - 1]
            //[index+1,right]
            stack.push(index - 1);
            stack.push(left);

            stack.push(right);
            stack.push(index + 1);
        }
    }
    //归并排序
    public static void mergeSort(int[] array) {
        //[0,array.length)
        mergeSortHelper(array,0,array.length);
    }
    private static void mergeSortHelper(int[] array,int left,int right) {
        if(left >= right || right - left == 1) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSortHelper(array,left,mid);
        mergeSortHelper(array,mid,right);
        merge(array,left,mid,right);

    }
    private static void merge(int[] array,int left,int mid,int right) {
        int length = right - left;
        int[] output = new int[length];
        int outputIndex = 0;
        int i = left;
        int j = mid;
        while(i < mid && j < right) {
            //=稳定性
            if(array[i] <= array[j]) {
                output[outputIndex++] = array[i++];
            }else {
                output[outputIndex++] = array[j++];
            }
        }
        while(i < mid) {
            output[outputIndex++] = array[i++];
        }
        while(j < right) {
            output[outputIndex++] = array[j++];
        }
        for(int k = 0;k < length;k++) {
            array[left + k] = output[k];
        }
    }
    public static void mergeSortByLoop(int[] array) {
        for(int gap = 1;gap < array.length;gap *= 2) {
            for(int i = 0;i < array.length;i += 2 * gap) {
                int beg = i;
                int mid = i + gap;
                int end = i + 2 * gap;
                if(mid > array.length) {
                    mid = array.length;
                }
                if(end > array.length) {
                    end = array.length;
                }
                merge(array,beg,mid,end);
            }
        }
    }

    //堆排序
    public static  void heapSort(int[] array) {
        //1.创建堆
        createHeap(array);
        //2.循环取出堆顶最大值，放到最后面
        for (int i = 0; i < array.length; i++) {
            swap(array,0,array.length - i - 1);
            shiftDown(array,array.length - i - 1,0);
        }
    }
    private static void shiftDown(int[] array,int size,int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while(child < size) {
            if(child + 1 < size
                && array[child + 1] > array[child]) {
                child = child + 1;

            }
            if(array[child] > array[parent]) {
                swap(array,child,parent);
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }
    private static void createHeap(int[] array) {
     for(int i = (array.length - 1 - 1) / 2;i >= 0;i--) {
         shiftDown(array,array.length,i);
     }
    }
    //插入排序
    public static void insertSort(int[] array) {
        for (int bound = 1; bound < array.length; bound++) {
            //bound 下标对应的元素就是待插入元素
            int tmp = array[bound];
            int cur = bound-1;
            for(; cur >= 0; cur--) {
                if(array[cur] > tmp) {
                    array[cur + 1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur + 1] = tmp;
        }
    }
    //希尔排序
    public static void shellSort(int[] array) {
        int gap = array.length;
        while( gap > 1) {
            insertSortGap(array,gap);
            gap = gap / 2;
        }
        insertSortGap(array,1);
    }
    private static void insertSortGap(int[] array,int gap) {
        for(int bound = 1; bound <array.length;bound++) {
            int tmp = array[bound];
            int cur = bound - gap;
            for (; cur >= 0; cur -= gap) {
                if (array[cur] > tmp) {
                    array[cur + gap] = array[cur];
                } else {
                    break;
                }
            }
            array[cur + gap] = tmp;
        }
    }
    //选择排序
    public static void selsctSort(int[] array) {
        for(int bound = 0;bound < array.length;bound++) {
            for(int cur = bound + 1;cur < array.length; cur++) {
                if(array[cur] < array[bound]) {
                    swap(array,cur,bound);
                }
            }
        }
    }
    private static void swap(int[] array,int x,int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5 , 2, 7, 3 , 6, 8, 1};
        //insertSort(arr);
        //shellSort(arr);
        //selsctSort(arr);
        //bubbleSort(arr);
        //quickSort(arr);
        //mergeSort(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
