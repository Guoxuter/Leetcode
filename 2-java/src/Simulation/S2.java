package Simulation;

public class S2 {

    /* Definition for singly-linked list. */

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        // 添加一个虚拟头结点（哨兵），帮助简化边界情况的判断。
        ListNode tmp = l3;
        int t = 0;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            t = a + b + t;
            tmp.next = new ListNode(t % 10);
            t = t / 10;
            tmp = tmp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (t != 0) {
            tmp.next = new ListNode(t);
        }
        return l3.next;
    }
    public static void main(String[] args){;}
}
