// 2022.10.30
package hot;

public class S142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null|| head.next==null)return null;

        ListNode s = head,f= head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f)break;
        }
        if(f==null || f.next==null)return null;

        f=head;
        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return s;

    }
}
