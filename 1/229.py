# 229. Nim游戏

class Solution:
    def canWinNim(self, n: int) -> bool:
        for i in range(1,4):
            if (n-i)%4==0:
                
                return True
            else:
                pass
        return False