package Norm;// 22.3.27 11
// 盛水最多的容器

public class S11 {
    public int maxArea(int[] height) {
        int max = 0, start = 0, end = height.length - 1;

        while (start < end) {
            int h = Math.min(height[start], height[end]);
            int area = h * (end - start);

            if (area > max)
                max = area;
            if (height[start]<height[end]) {
                while (height[start] > height[++start]) continue;
            } else {
                while (height[end] > height[--end]) continue;
            }
        }
        return max;
    }
}
