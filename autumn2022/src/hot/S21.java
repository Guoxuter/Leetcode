// 2022.10.28

package hot;

public class S21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode cur = ans;

        while (list1 != null && list2 != null) {
            int l1 = list1.val;
            int l2 = list2.val;
            if (l1 < l2) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur=cur.next;
        }

        if (list1 == null) cur.next = list2;
        else cur.next = list1;
        return ans.next;
    }
}
