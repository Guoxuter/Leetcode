// 2022.5.6
// 两数相加
// 2
package hot;

public class S2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        ListNode cur=ans;
        int ads=0;
        // 执行相加过程
        while(l1!=null && l2!=null){
            cur.next=new ListNode();
            cur=cur.next;

            ads+=(l1.val+l2.val);
            cur.val=ads%10;
            ads/=10;
            l1=l1.next;
            l2=l2.next;
        }

        // 如果两链表不一样长，直接把后续加上ads
        while(l1!=null){
            cur.next=new ListNode();
            cur=cur.next;
            ads+=l1.val;
            cur.val=ads%10;
            ads/=10;

            l1=l1.next;

        }
        while(l2!=null){
            cur.next=new ListNode();
            cur=cur.next;
            ads+=l2.val;
            cur.val=ads%10;
            ads/=10;
            l2=l2.next;
        }

        // 最后需要进一位的情况
        if(ads>0){
            cur.val=ads;
        }
        return ans.next;
    }
}
