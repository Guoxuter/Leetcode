package Double_pointer;

// 11.1 2
// 路径交叉
public class S335 {
    public boolean isSelfCrossing(int[] distance) {

        int n = distance.length;
        if (n < 4) return false;

        for (int i = 0; i < n - 3; i++) {
            if (distance[i] >= distance[i + 2] && distance[i + 1] <= distance[i + 3]) return true;
            if (i >= 1 && distance[i + 2] == distance[i] && distance[i + 3] + distance[i - 1] >= distance[i + 1])
                return true;
            if (i >= 2 && distance[i + 2] <= distance[i] && distance[i + 1] > distance[i - 1] && distance[i + 3] + distance[i - 1] >= distance[i + 1] && distance[i + 2] + distance[i - 2] >= distance[i])
                return true;
        }

        return false;

    }

    public static void main(String[] args) {
        ;
    }
}
