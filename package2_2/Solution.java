package package2_2;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char i : arr) {
            if(stack.size() == 0) {
                stack.push(i);
            } else if(issym(stack.peek(),i)) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        return stack.size() == 0;
    }
    public boolean issym(char c1,char c2) {
        return (c1 == '(' && c2 == ')' ||
                (c1 =='[' && c2 == ']') || (c1 == '{' && c2 == '}'));
    }
}
