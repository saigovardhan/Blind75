class Solution:
    def canJump(self, nums: List[int]) -> bool:
        rechable = 0
        for i,num in enumerate(nums):
            if i>rechable:return False
            if rechable > len(nums)-1:return True
            rechable = max(rechable, i+num)
        return True