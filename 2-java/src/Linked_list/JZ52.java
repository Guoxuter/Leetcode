package Linked_list;

// 11.22 4
// 两个链表的第一个公共结点
import Simulation.S2.ListNode;
public class JZ52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode ta = pHead1, tb = pHead2;

        while(ta!=tb ){
            ta=ta==null?pHead2:ta.next;
            tb=tb==null?pHead1:tb.next;
        }
        return ta;
    }
}
