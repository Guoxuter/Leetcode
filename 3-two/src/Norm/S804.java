package Norm;// 2022.4.11
// 唯一摩尔斯密码词

import java.util.HashSet;

public class S804 {
    private static String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i< words.length;i++){
            StringBuilder sb = new StringBuilder();
            String s=words[i];
            for(char c: s.toCharArray()){
                sb.append(morse[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();

    }
}
