package SecondBrush;

import Simulation.S2.ListNode;
// 11.28 2
// Leecode 2 两数相加
public class S2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode tmp = l3;
        int t=0;
        while(l1!=null||l2!=null){
            int a=l1!=null?l1.val:0;
            int b=l2!=null?l2.val:0;
            tmp.next=new ListNode((a+b+t)%10);
            t=(a+b+t)/10;
            tmp=tmp.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }

        if(t!=0)tmp.next=new ListNode(t);
        return l3.next;
    }
}
