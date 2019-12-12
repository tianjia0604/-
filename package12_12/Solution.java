package package12_12;
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.Arrays;
import java.util.Stack;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        Stack<Integer>sta = new Stack<Integer>();
        for(int i=0; i<array.length; i++){
            if(sta.empty() || sta.peek()!=array[i]) {
                sta.push(array[i]);
            }else if(sta.peek() == array[i]) {
                sta.pop();          }
        }
        num1[0] = sta.pop();
        num2[0] = sta.pop();
    }
}