package package3_13;

import java.util.ArrayList;
import java.util.Stack;

public class Main3 {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList list = new ArrayList();
//        Stack stack = new Stack();
//        while(listNode != null) {
//            stack.push(listNode.val);
//            listNode = listNode.next;
//        }
//        while(!stack.empty()) {
//            list.add(stack.pop());
//        }
//        return list;
        ArrayList list = new ArrayList();
        while(listNode != null) {
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}
