# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        count = 0

        ret= ListNode()
        tmp=ret

        while l1 or l2 or count:
            pernum=0
            if l1:
                pernum+=l1.val
                l1=l1.next
