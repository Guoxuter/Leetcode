package week290;

import java.util.HashMap;
import java.util.Map;

public class S6042 {
    public static int countLatticePoints(int[][] circles) {
        Map<String,Integer> map=new HashMap<>();

        for(int[] c:circles){
            int x=c[0],y=c[1],r=c[2];
            for(int i=x-r;i<=x+r;i++){
                for(int j=y-r;j<=y+r;j++){
                    if(Math.pow((i-x),2)+Math.pow((j-y),2)<=Math.pow(r,2))
                        map.put(i+","+j,1);
                }
            }
        }

        return map.size();
    }

    public static void main(String[] args){
        int[][]n={{2,2,1}};
        System.out.println(countLatticePoints(n));
    }

}
