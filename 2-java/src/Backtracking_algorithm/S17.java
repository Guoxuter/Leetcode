package Backtracking_algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 11.12 5
// 电话号码的字母组合
public  class S17 {
    static Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public static List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0)return ans;

        backtrack(ans, digits, 0, new StringBuffer());
        return ans;

    }

    public static void backtrack(List<String> ans,  String digits, int index, StringBuffer c) {
        if(index==digits.length()){ans.add(c.toString());return;}
        char d=digits.charAt(index);
        String ph=phoneMap.get(d);
        for (int i = 0; i < ph.length(); i++) {
            c.append(ph.charAt(i));
            // backtrack(ans, phoneMap, digits, index + 1,c);
            c.deleteCharAt(index);
        }


    }


}
