// 2022.10.28

package hot;

public class S19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans=new ListNode();
        ans.next=head;
        ListNode r = ans;
        ListNode l = ans;
        for(int i=0;i<n;i++){
            r=r.next;
        }

        while(r.next!=null){
            r=r.next;
            l=l.next;
        }
        l.next=l.next.next;
        return ans.next;
    }
}
