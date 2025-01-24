class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        a=nums[0]
        for i in nums:
            if abs(a)>abs(i):
                a=i
        if a<0 and abs(a) in nums:
            return abs(a)
            
        return a