# 704. 二分查找

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if target < nums[0]:
            return -1
        elif target>nums[-1]:
            return -1
        

        l=0
        r=len(nums)
        while l<=r:
            tag=int((l+r)/2)
            if nums[tag]==target:
                return tag

            elif nums[tag]>target:
                r=tag-1
            
            elif nums[tag]<target:
                l=tag+1

        return -1
            
            

