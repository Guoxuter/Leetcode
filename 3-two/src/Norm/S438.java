package Norm;// 22.4.1 438
// 找到字符串中所有字母异位词


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        if(p.length()>s.length())return ans;
        int l = 0, r = p.length() - 1;
        int[] nums = new int[26], nump = new int[26];
        for (int i = 0; i < p.length(); i++) {
            nums[s.charAt(i) - 'a']++;
            nump[p.charAt(i) - 'a']++;
        }
        while (r < s.length() - 1) {
            if (Arrays.equals(nums, nump)) ans.add(l);
            nums[s.charAt(l++) - 'a']--;
            nums[s.charAt(++r) - 'a']++;
        }
        if (Arrays.equals(nums, nump)) ans.add(l);
        return ans;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
