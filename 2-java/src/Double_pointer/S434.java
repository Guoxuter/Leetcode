package Double_pointer;


// 11.6 3
// 字符中的单词数
public class S434 {

    public static int countSegments(String s) {
        char c;
        int count=0, tag=1;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c==32 && tag==0){count++;tag=1;}
            else if(c==32)tag=1;
            else {tag=0;}
        }
        if(tag==0)count++;        return count;

    }

    public static void main(String[] args){
        System.out.println(countSegments("      "));
    }
}
