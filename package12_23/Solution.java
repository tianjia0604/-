package package12_23;

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(sum < 3) {
            return result;
        }
        int pLeft = 1;int pRight = 2;
        while(pLeft < pRight) {
            int temp = (pLeft + pRight)*(pRight - pLeft + 1)/2;
            if(temp == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = pLeft;i <= pRight;i++) {
                    list.add(i);
                }
                result.add(list);
                pLeft++;
            }else if(temp < sum) {
                pRight++;
            }else {
                pLeft++;
            }
        }
        return result;
    }
}