package Linked_list;

// 11.22 1
// 从尾到头打印链表

import Simulation.S2.ListNode;

import java.util.ArrayList;

public class JZ6 {


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int[] ret=new int[10001];
        while(listNode!=null){
            ret[i++]=listNode.val;
            listNode=listNode.next;
        }
        while(i>0){
            ans.add(ret[--i]);
        }

        return ans;

    }
}



