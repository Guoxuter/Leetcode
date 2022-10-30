// 2022.10.30
package hot;

public class S141 {
    public boolean hasCycle(ListNode head) {
        if(head==null|| head.next==null)return false;

        ListNode s = head,f= head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f)return true;
        }
        return false;

    }

}
