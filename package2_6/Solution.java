package package2_6;

import java.util.Stack;

//根据逆波兰表示法，求表达式的值。
//有效的运算符包括 +, -, *, / 。
// 每个运算对象可以是整数，也可以是另一个逆波兰表达式。
//输入: ["2", "1", "+", "3", "*"]
//输出: 9
//解释: ((2 + 1) * 3) = 9
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            switch(s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    int s1 = stack.pop();
                    int s2 = stack.pop();
                    stack.push(s2 / s1);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}


