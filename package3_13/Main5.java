package package3_13;

import java.util.Stack;

public class Main5 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public void appendTail(int node){
        stack1.push(node);
        System.out.println(stack1);
    }
    public Integer deleteHead() throws Exception {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            throw new Exception("队列为空，不能删除");
        }
        System.out.println(stack2);
        return stack2.pop();
    }
    public static void main(String[] args) throws Exception {
        Main5 test = new Main5();
        test.appendTail(1);
        test.appendTail(2);
        test.appendTail(3);
        test.deleteHead();
    }
}
