class Solution(object):
    def findXSum(self, nums, k, x):
        """
        :type nums: List[int]
        :type k: int
        :type x: int
        :rtype: List[int]
        """
        n =len(nums)
        ans=[]

        for i in range (n-k+1):
            window = nums[i:i+k]
            freq = Counter(window)

            top = sorted(freq.items(), key = lambda p:(-p[1],-p[0]))
            keep = set([val for val, count in top[:x]])

            windowsum = sum(v for v in window if v in keep)
            ans.append(windowsum)

        return ans
        