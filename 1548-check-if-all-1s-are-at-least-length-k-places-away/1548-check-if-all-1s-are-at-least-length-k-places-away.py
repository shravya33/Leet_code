class Solution(object):
    def kLengthApart(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        dist=k 
        for i in range (len(nums)):
            if nums[i] ==1:
                if dist <k:
                    return False
                dist =0

            else:
                dist +=1
        
        return True