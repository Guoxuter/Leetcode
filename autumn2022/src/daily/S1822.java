// 2022.10.27

package daily;

public class S1822 {
    public int arraySign(int[] nums) {
        int count=1;
        for(int i: nums){
            if(i<0)count=-count;
            if(i==0)return 0;
        }
        return count;
    }
}
