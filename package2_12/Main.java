package package2_12;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(input.length == 0 || k == 0 || k > input.length) {
            return arr;
        }
        Arrays.sort(input);
        for(int i = 0;i < k;i++) {
            arr.add(input[i]);
        }
        return arr;
    }
}

