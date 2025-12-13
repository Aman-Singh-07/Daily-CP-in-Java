// https://codeforces.com/problemset/problem/1294/C


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            List<Integer> factors = new ArrayList<>();
            int temp = n;
            for (int i = 2; i * i <= temp && factors.size() < 2; i++) {
                if (temp % i == 0) {
                    factors.add(i);
                    temp /= i;
                }
            }
            if (factors.size() < 2) {
                System.out.println("NO");
                continue;
            }
            int third = temp;
            if (third > 1 && third != factors.get(0) && third != factors.get(1)) {
                System.out.println("YES");
                System.out.println(factors.get(0) + " " + factors.get(1) + " " + third);
            } else {
                System.out.println("NO");
            }
        }
    }
}
