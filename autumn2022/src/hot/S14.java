package hot;

public class S14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix=strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            prefix = longest(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;

    }

    public String longest(String str1,String str2){
        int n=Math.min(str1.length(),str2.length());
        int index=0;
        while(index < n && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}
