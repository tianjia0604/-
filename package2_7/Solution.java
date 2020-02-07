package package2_7;

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 1){
            return res;
        }
        // 初始化[]
        res.add(new ArrayList<>());
        for(int i=0; i < nums.length; i++){
            int size = res.size();
            for(int j = 0; j < size; j++){
                List<Integer> list = res.get(j);
                List<Integer> tmpList = new ArrayList<>(list);//c逐一取出中间结果集
                tmpList.add(nums[i]);//加入中间结果集
                res.add(tmpList);//加入最终结果集
            }
        }
        return res;
    }
}