package Double_pointer;

// 11.6 6
// 环形数组是否存在循环
public class S457 {
    public boolean circularArrayLoop(int[] nums) {
        int cur,next,tag=0,n=nums.length,k=0;
        int[] vis=new int[n];

        //next = ((cur + nums[cur]) % n + n ) % n
        for(int i=0;i<n;i++){
            if(vis[i]!=0)continue;
            k++;
            cur=i;
            boolean f=nums[cur]>0;
            while(true){
                next= ((cur + nums[cur]) % n + n ) % n;
                // 自循环不行
                if(next==cur)break;
                if(vis[next]!=0){
                    if(vis[next]==k)return true;
                    else return false;
                }

                if(!f && nums[next]>0)break;
                if(f && nums[next]<0)break;
                vis[next]=k;
                cur=next;
            }
        }
        return false;
    }
}
