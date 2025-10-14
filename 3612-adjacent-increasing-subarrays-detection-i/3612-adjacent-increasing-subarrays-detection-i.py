class Solution(object):
    def hasIncreasingSubarrays(self, nums, k):
        n = len(nums)
        if k == 1:
            return n >= 2
        if n < 2 * k:
            return False
    
        valid = [nums[i] < nums[i+1] for i in range(n-1)]
    
        prefix = [0] * n
        for i in range(1, n):
            prefix[i] = prefix[i-1] + (1 if valid[i-1] else 0)
    
        for a in range(n - 2 * k + 1):
            if prefix[a + k - 1] - prefix[a] != k - 1:
                continue
            if prefix[a + 2 * k - 1] - prefix[a + k] == k - 1:
                return True
        return False