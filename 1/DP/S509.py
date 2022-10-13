# 2022.4.25
# 斐波那切数

class Solution:
    def fib(self, n: int) -> int:
        pre=0
        cur=1
        if n==0:return pre
        
        for i in range(2,n+1):
            sum=pre+cur
            pre=cur
            cur=sum
        return cur


if __name__=="__main__":
    print(Solution().fib(10))