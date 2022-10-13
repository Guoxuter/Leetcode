package Linked_list;

// 11.22 5
// 链表中环的入口结点
import Simulation.S2.ListNode;
public class JZ23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast=pHead;
        ListNode slow=pHead;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)break;
        }
        if(fast==null||fast.next==null)return null;

        fast=pHead;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;

    }
}
