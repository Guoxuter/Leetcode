# 2022.4.27
# 打家劫舍

class Solution:
    def rob(self, nums: List[int]) -> int:
        # 考虑为数组长度为1的情况
        if len(nums)==1:
            return nums[0]

        # 用变量存储前两个状态的值
        dp0=nums[0]
        dp1=max(dp0,nums[1])

        # 遍历进行状态转移
        for i in range(2,len(nums)):
            dp2=max(dp0+nums[i],dp1)
            dp0=dp1
            dp1=dp2

        return dp2

