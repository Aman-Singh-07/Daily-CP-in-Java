// https://codeforces.com/problemset/problem/2074/A

import java.util.*;

public class Main {
    public static int dist2(int x1, int y1, int x2, int y2){
        return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int l = input.nextInt();
            int r = input.nextInt();
            int d = input.nextInt();
            int u = input.nextInt();

            int[][] points = {
                {-l, 0}, {r, 0}, {0, -d}, {0, u}
            };

            List<Integer> distances = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    distances.add(dist2(points[i][0], points[i][1], points[j][0], points[j][1]));
                }
            }

            Collections.sort(distances);
            if (distances.get(0).equals(distances.get(1)) &&
                distances.get(1).equals(distances.get(2)) &&
                distances.get(2).equals(distances.get(3)) &&
                distances.get(4).equals(distances.get(5)) &&
                distances.get(0) < distances.get(4)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
