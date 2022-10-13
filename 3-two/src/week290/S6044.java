package week290;

public class S6044 {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int n=flowers.length;
        int[] ans=new int[persons.length];
        for(int i=0;i<ans.length;i++)
            ans[i]=flowers.length;
        for(int i=0;i<persons.length;i++){
            int p=persons[i];
            for(int [] f:flowers){
                if(p>f[1])ans[i]--;
                else if(p<f[0])ans[i]--;
            }
        }
        return ans;
    }
}
