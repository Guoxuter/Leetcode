package Norm;// 2022.4.29
// 建立四叉树
// 每日一题

public class S427 {
    int [][] g;
    public Node construct(int[][] grid) {
        g=grid;
        int n=g.length;
        return dfs(0,0,n-1,n-1);

    }

    public Node dfs(int a,int b, int c,int d){
        boolean ok=true;
        int t=g[a][b];
        for(int i=a;i<=c && ok;i++){
            for(int j=b;j<=d && ok;j++){
                if(g[i][j]!=t) ok=false;
            }
        }
        if(ok) return new Node(t==1,true);
        Node root=new Node(t==1,false);
        int dx=c-a+1,dy=d-b+1;
        root.topLeft = dfs(a, b, a + dx / 2 - 1, b + dy / 2 - 1);
        root.topRight = dfs(a, b + dy / 2, a + dx / 2 - 1, d);
        root.bottomLeft = dfs(a + dx / 2, b, c, b + dy / 2 - 1);
        root.bottomRight = dfs(a + dx / 2, b + dy / 2, c, d);
        return root;




    }
}
