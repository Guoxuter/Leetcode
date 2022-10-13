package hot100;

import java.util.List;

public class S2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        int c = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int s = x + y + c;
            cur.next = new ListNode(s % 10);
            c = s / 10;
            cur = cur.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }

        if (c == 1) {
            cur.next = new ListNode(1);
        }
        return ans.next;

    }
}
