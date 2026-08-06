class Solution(object):
    def smallestNumber(self, n, t):
        """
        :type n: int
        :type t: int
        :rtype: int
        """
        
        while(True):
            ans=n
            product=1
            while ans>0:
                product = product*(ans%10)
                ans=ans//10

            if(product%t==0):
                return n
            
            n+=1


        