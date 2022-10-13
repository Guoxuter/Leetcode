package Norm;// 2022.4.19
// 电话号码和字母的组合

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S17 {
    static Map<Character, String[]> map = new HashMap<>() {{
        put('1', new String[]{""});
        put('2', new String[]{"a", "b", "c"});
        put('3', new String[]{"d", "e", "f"});
        put('4', new String[]{"g", "h", "i"});
        put('5', new String[]{"j", "k", "l"});
        put('6', new String[]{"m", "n", "o"});
        put('7', new String[]{"p", "q", "r", "s"});
        put('8', new String[]{"t", "u", "v"});
        put('9', new String[]{"w", "x", "y", "z"});
    }};

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == "") return ans;
        StringBuilder sb = new StringBuilder();

        dfs(digits, 0, sb, ans);

        return ans;
    }

    public static void dfs(String digits, int k, StringBuilder sb, List<String> ans) {
        if (k == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        char c = digits.charAt(k++);
        String[] curs = map.get(c);

        for (String cur : curs) {
            sb.append(cur);
            dfs(digits, k, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}
