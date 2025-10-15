class Solution:
    def maxIncreasingSubarrays(self, nums):
        n = len(nums)
        pre, suff = [0]*(n + 1), [0]*(n+1)
        for i in range(1, n + 1):
            pre[i] = pre[i-1] + 1 if i > 1 and nums[i-2] < nums[i-1] else 1
        for i in range(n, 0, -1):
            suff[i] = suff[i+1] + 1 if i < n and nums[i-1] < nums[i] else 1
        ans = 0
        for i in range(1, n + 1):
            ans = max(ans, min(pre[i-1], suff[i]))
        return ans