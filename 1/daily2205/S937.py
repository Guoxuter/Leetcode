# 2022.05.03
# 重新排列日志文件

class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        def trans(log:str)->tuple:
            a,b=log.split(' ',1)
            # 用0是把字母和数字前后排
            return (0,b,a) if b[0].isalpha() else (1,)


        logs.sort(key=trans)
        return logs