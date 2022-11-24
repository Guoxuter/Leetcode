package hot;

import java.util.HashMap;
import java.util.Map;

public class S560 {
    public int subarraySum(int[] nums, int k) {
        int n= nums.length;
        int ans=0;
        int[] sum=new int[n+10];
        sum[0]=nums[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            int s=sum[i];
            ans+=map.getOrDefault(s-k,0);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return ans;
    }
}
