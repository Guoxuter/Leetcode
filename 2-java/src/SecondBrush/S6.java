package SecondBrush;

// 12.10 1
// Leecode 6 Z字形变换
public class S6 {
    public String convert(String s, int numRows) {
        StringBuilder ans=new StringBuilder();
        int n = s.length();
        if (n == 1 || numRows== 1) return s;

        for(int i=0;i<numRows;i++){
            int sum=i;
            int add=2*(numRows-i-1);
            if(i==0 ||i==numRows-1){
                add=2*numRows-2;
            }


            while(sum < n){
                ans.append(s.charAt(sum));
                sum+=add;
                if(i!=0 && i!=numRows-1){
                    add=2*numRows-2-add;
                }
            }
        }
        return ans.toString();
    }
}
