package Norm;// 2022.4.19
// 括号生成

import java.util.ArrayList;
import java.util.List;

public class S22 {
    public static List<String> generateParenthesis(int n) {
        int l = n, r = n;
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        dfs(l, r, sb, ans);

        return ans;

    }

    public static void dfs(int l, int r, StringBuilder sb, List<String> ans) {
        if (r == 0) {
            ans.add(sb.toString());
            return;
        }

        if (l > 0) {
            sb.append('(');
            dfs(l - 1, r, sb, ans);
            sb.delete(sb.length()-1,sb.length());
        }
        if (r > l) {
            sb.append(')');
            dfs(l, r - 1, sb, ans);
            sb.delete(sb.length()-1,sb.length());
        }
    }

    public static void main(String[] args) {

        System.out.println(generateParenthesis(3));
    }
}
