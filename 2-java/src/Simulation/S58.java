package Simulation;
// 最后一个单词的长度
public class S58 {
    public static int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int sum=0;
        while(s.charAt(i)==' '){
            i--;// 至少包含一个单词
        }
        for(i=i;i>=0;i--){
            if(s.charAt(i)==' ')break;
            else sum++;

        }
        return sum;
    }

    public static void main(String[] args){
        System.out.print(lengthOfLastWord(" dsaf ddddd   "));
    }
}
