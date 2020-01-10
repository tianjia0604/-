package package1_10;

import java.util.*;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1){
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        //构建list
        for(int i = 0;i<n;i++){
            list.add(i);
        }
        int cur = -1;
        while(list.size()>1){
            for(int i = 0;i<m;i++){
                cur++;
                if(cur == list.size()){
                    cur = 0;
                }
            }
            list.remove(cur);
            cur--;
            //cur--的原因，因为新的list中cur指向了下一个元素，为了保证移动m个准确性，所以cur向前移动一位。
        }
        return list.get(0);
    }
}