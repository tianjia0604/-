package package12_30;

import java.util.HashSet;
import java.util.Set;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        int max = -1;
        int min = 14;
        for(int a : numbers) {
            if(!set.add(a) && a!=0) {
                return false;
            }
            if(a!=0) {
                max = Math.max(max,a);
                min = Math.min(min,a);
            }
        }
        if(max - min <= 4) {
            return true;
        }
        return false;
    }
}
