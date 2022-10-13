package Norm;// 22.3.28 19
// 删除链表的倒数第N个结点

public class S19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return head.next;
        ListNode slow = head;
        ListNode fast = head;

        while(n-->0)fast=fast.next;
        if (fast == null) {
            head = slow.next;
            return head;
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}
