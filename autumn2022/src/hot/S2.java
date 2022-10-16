// 2022.10.13
package hot;

public class S2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode();
        ListNode cur=ans;
        int val=0;
        while(l1!=null & l2!=null){
            cur.next=new ListNode();
            cur=cur.next;

            val=l1.val+l2.val+val;
            cur.val=val%10;
            val/=10;

            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            cur.next=new ListNode();
            cur=cur.next;
            val=l1.val+val;
            cur.val=val%10;
            val/=10;
            l1=l1.next;
        }
        while(l2!=null){
            cur.next=new ListNode();
            cur=cur.next;
            val=l2.val+val;
            cur.val=val%10;
            val/=10;
            l2=l2.next;
        }

        if(val!=0)cur.next=new ListNode(val);
        return ans.next;
    }
}
