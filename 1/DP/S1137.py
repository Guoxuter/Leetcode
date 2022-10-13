# 2022.4.25
# 第 N 个泰波那契数

class Solution:
    def tribonacci(self, n: int) -> int:
        pre0=0
        pre1=1
        cur2=1
        if n==0:
            return 0

        elif n==1:
            return 1

        for i in range(3,n+1):
            sum=pre0+pre1+cur2
            pre0=pre1
            pre1=cur2
            cur2=sum
        
        return cur2