// 2022.5.9
// 增减字符串匹配
// 每日一题

package Daily2022_5;

public class S942 {
    public int[] diStringMatch(String s) {
        int n=s.length(),l=0,r=n,index=0;
        int[] ans=new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I')ans[index++]=l++;
            else ans[index++]=r--;
        }
        ans[index] = r;
        return ans;
    }
}
