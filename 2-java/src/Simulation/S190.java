package Simulation;

// 点到二进制位
public class S190 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            int t=(n>>i) & 1;
            if(t==1){
                ans|=(1<<(31-i));
            }

        }
return ans;
    }

    public static void main(String[] args){
        reverseBits(231);
    }
}
