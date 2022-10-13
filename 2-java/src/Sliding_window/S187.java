package Sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 11.11 2
// 重复的DNA序列
public class S187 {
    public static List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map= new HashMap<>();
        List<String> ans=new ArrayList<>();

        for(int i=0;i<=s.length()-10;i++){
                String dna=s.substring(i,i+10);
                map.put(dna, map.getOrDefault(dna,0)+1);
                if (map.get(dna)==2){
                    ans.add(dna);
                }

        }
        return ans;
    }

    public static void main(String[] args){
        List<String> ans=findRepeatedDnaSequences("AAAAAAAAAAA");
        System.out.println(ans);
    }
}
