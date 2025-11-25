class Solution(object):
    def findFinalValue(self, nums, original):
        """
        :type nums: List[int]
        :type original: int
        :rtype: int
        """
        found = set(nums)
        n = original

        while(n in found):
            n =n*2

        return n
        