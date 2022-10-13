package week290;

public class S6043 {
    public static int[] countRectangles(int[][] rectangles, int[][] points) {
        int[] ans=new int[points.length];
        for(int i=0;i<ans.length;i++)
            ans[i]=rectangles.length;
        for(int i=0;i<points.length;i++){
            for(int[] rc:rectangles){
                if(points[i][1]>rc[1])ans[i]-=1;
                else if(points[i][0]>rc[0])ans[i]-=1;
            }

        }
        return ans;
    }

    public static void main(String[] args){
        int[][] rc={{1,1},{2,2},{3,3}},
                ps={{1,3},{1,1}};

    }
}
