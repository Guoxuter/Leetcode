package Simulation;

// Excel表列序号
public class S171 {
    public static int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int num=0, count=0;

        for(int i=0;i<n;i++){
            num=columnTitle.charAt(i)-'A'+1;
            count=count*26+num;
        }
        return count;


    }
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));

    }
}
