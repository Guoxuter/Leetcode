package Simulation;
// 最长公共前缀
public class s14 {
    public static String longestCommonPrefix(String[] strs) {
        String ret = "";
        if(strs.length==1)return strs[0];

        int tag=0;
        int i=0;
        String s=strs[0];
        if(s=="")return ret;
        while(i<s.length()) {


            char c = s.charAt(i);
            for(String item: strs){
                if(i>=item.length() || item.charAt(i)!=c) return ret;

            }
            ret+=String.valueOf(c);
            i++;

        }
        return ret;

    }
    public static void main(String[] args){
        String[] ss= new String[]{"ab","a"};
        System.out.println(longestCommonPrefix(ss));
    }

}
