package Norm;// 2022.4.13
// 比较版本号

public class S165 {
    public static int compareVersion(String version1, String version2) {
        int i = 0;
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        while (i < v1.length || i < v2.length) {
            int a = 0, b = 0;
            if (i < v1.length) a = Integer.parseInt(v1[i]);
            if (i < v2.length) b = Integer.parseInt(v2[i]);
            if (a > b) return 1;
            if (a < b) return -1;
            i++;
        }
        return 0;
    }

    public int fuxi(String version1, String version2) {
        int i = 0;

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        while (i < v1.length || i < v2.length) {
            int a = 0, b = 0;
            if (i < v1.length) a = Integer.parseInt(v1[i]);
            if (i < v2.length) b = Integer.parseInt(v2[i]);
            if (a < b) return -1;
            if (a > b) return 1;
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String v1 = "7.5.2.4", v2 = "7.5.3";
        compareVersion(v1, v2);

    }

}
