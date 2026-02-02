class Solution:
    def separateDigits(self, nums):
        ret = []
        for n in nums:
            for c in str(n):
                ret.append(int(c))
        
        return ret
