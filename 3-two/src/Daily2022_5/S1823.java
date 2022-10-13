// 2022.5.4
// 找出游戏的获胜者
// 每日一题


// 解答没搞懂过程，为啥递归可以
package Daily2022_5;

public class S1823 {
    public int findTheWinner(int n, int k) {
        if(n<=1)return n;
        int ans;

        // 下一个环，因为环是从k+1开始的，因此返回+k
        ans=findTheWinner(n-1,k)+k;

        ans%=n;
        System.out.println(n+"__"+ans);
        // 返回答案时我们需要将结果为 0 的值映射回编号 n
        return ans==0?n:ans;
    }
}
