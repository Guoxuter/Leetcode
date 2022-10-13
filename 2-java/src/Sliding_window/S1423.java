package Sliding_window;

// 11.11 5
// 可能获得的最大点数
public class S1423 {
    public int maxScore(int[] cardPoints, int k) {
        int p=0,sum=0,kk=cardPoints.length-k;
        for(int i=0;i<cardPoints.length;i++)sum+=cardPoints[i];
        for(int i=0;i<kk;i++)p+=cardPoints[i];
        int cur=p;
        for(int i=0;i+kk<cardPoints.length;i++){
            cur+=cardPoints[i+kk];
            cur-=cardPoints[i];
            p=Math.min(p,cur);
        }
        return sum-p;
    }
}
