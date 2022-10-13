package Linked_list;

import Simulation.S2.ListNode;

// 11.22 3
// 合并两个排序的链表
public class JZ25 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(0);
        ListNode cur=ans;

        while(list1!=null &&list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                list1=list1.next;
            }
            else{
                cur.next=list2;
                list2=list2.next;
            }
            cur = cur.next;

        }
        if(list1!=null) cur.next=list1;
        else cur.next=list2;

        return ans.next;
    }
}
