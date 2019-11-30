package package11_3002;

public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        ListNode newlist = new ListNode(0);
        ListNode newtail = newlist;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                newtail.next = new ListNode(list1.val);
                list1 = list1.next;
                newtail = newtail.next;
            }else {
                newtail.next = new ListNode(list2.val);
                list2 = list2.next;
                newtail = newtail.next;
            }
        }
        if(list1 != null) {
            newtail.next = list1;
        }else {
            newtail.next = list2;
        }
        return newlist.next;
    }
}
