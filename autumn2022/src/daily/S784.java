// 2022.10.30

package daily;

import java.util.ArrayList;
import java.util.List;

public class S784 {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        back(s, new StringBuilder(), ans, 0);
        return ans;
    }

    public static void back(String s, StringBuilder sb, List<String> ans, int cur) {

        if (cur == s.length()) {
            ans.add(sb.toString());
            return;
        }

        sb.append(s.charAt(cur));
        back(s, sb, ans, cur + 1);
        sb.deleteCharAt(sb.length()-1);
        if(!Character.isDigit(s.charAt(cur))){
            sb.append((char) (s.charAt(cur)^32));
            back(s, sb, ans, cur + 1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
