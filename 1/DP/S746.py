# 2022.4.26
# 使用最小花费爬楼梯

class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n=len(cost)
        dp0=0
        dp1=0

        for i in range(2,n+1):
            dp2=min(dp1+cost[i-1],dp0+cost[i-2])
            dp0=dp1
            dp1=dp2
        return dp2