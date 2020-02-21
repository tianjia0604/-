package LinkedList;


class Solution {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
          }
      }
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        if(head.val == val) {
            return head.next;
        }
        ListNode prev = head;
        ListNode node = prev.next;
        while(node != null) {
            if(node.val == val) {
                prev.next = node.next;
                node = prev.next;
            }else {
                prev = node;
                node = node.next;
            }
        }
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }
    //反转单链表
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    //递归版本
    public ListNode reverseList2(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
    //返回中间节点
    public ListNode middleNode(ListNode head) {
          int steps = size(head)/2;
          ListNode prev = head;
          for(int i = 0;i < steps;i++) {
              prev = prev.next;
          }
          return prev;
    }
    public int size(ListNode head) {
          int size = 0;
          for(ListNode cur = head;cur != null;cur = cur.next) {
              size++;
          }
          return size;
    }
    //倒数第K个节点
    public ListNode FindKthToTail(ListNode head,int k) {
          int len = size(head);
          if(head == null || k < 0 || k > len) {
              return null;
          }
          int offset = len - k;
          ListNode prev = head;
          for(int i = 0;i < offset;i++) {
              prev = prev.next;
          }
          return prev;
    }
}