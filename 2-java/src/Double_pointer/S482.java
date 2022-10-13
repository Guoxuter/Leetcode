package Double_pointer;

// 11.6 7
// 密钥格式化
public class S482 {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder(s.length());
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-')continue;
            if(count==k) {
                ans.append("-");
                count=0;
            }
            ans.append(s.charAt(i));
            count++;
        }
        return ans.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.print(licenseKeyFormatting("5F3Z-2e-9-w",4));
    }
}
