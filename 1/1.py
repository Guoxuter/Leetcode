class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hasdic={}
        for i in range(len(nums)):
            if target-nums[i] in hasdic:
                return [hasdic[target-nums[i]],i]
            hasdic[nums[i]]=i

        return []