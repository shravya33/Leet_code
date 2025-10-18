class Solution:
    def maxDistinctElements(self, nums, k):
        nums.sort()

        ans=0
        prev = -10**9

        for i in nums:
            if max(i - k, prev + 1) <= i + k:
                prev = max(i - k, prev + 1)
                ans += 1
                
        return ans