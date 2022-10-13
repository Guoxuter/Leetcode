# 2022.4.26
# 爬楼梯

class Solution:
    def climbStairs(self, n: int) -> int:
        p=0
        q=0
        r=1
        for i in range(n):
            p=q
            q=r
            r=p+q
        return r