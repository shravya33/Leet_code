class Solution(object):
    def maxFreqSum(self, s):
        """
        :type s: str
        :rtype: int
        """
        vowels = "aeiou"
        # consonant = "bcdfghjklmnpqrstvwxyz"

        vcount=0
        ccount=0
        vcset = set(s)
        for i in vcset:
            if i in vowels:
                vcount=max(vcount, s.count(i))
            else:
                ccount=max(ccount, s.count(i))
        
        return vcount+ccount
        