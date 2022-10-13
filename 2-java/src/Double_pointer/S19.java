package Double_pointer;

import Simulation.S2.ListNode;

// 11.7 4
// 删除链表的倒数第N个结点
public class S19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        ListNode i = head;
        ListNode j = head;
        while (n-- > 0) j = j.next;
        if (j == null) head = i.next;
        else {
            while (j.next != null) {
                    i=i.next;
                    j=j.next;
            }
            i.next=i.next.next;
        }
        return head;
    }
}
