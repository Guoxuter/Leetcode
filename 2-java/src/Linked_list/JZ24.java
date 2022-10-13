package Linked_list;
// 11.22 2
// 反转链表
import Simulation.S2.ListNode;

public class JZ24 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        ListNode nex=null;

        while(cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        return pre;


    }
}
