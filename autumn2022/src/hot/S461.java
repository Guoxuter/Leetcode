// 2022.11.25
package hot;

public class S461 {
    public int hammingDistance(int x, int y) {
        int res=0;
        while(x!=0 || y!=0){
            if(x%2!=y%2)res++;
            x=x/2;
            y=y/2;
        }
        return res;
    }
}
