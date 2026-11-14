// https://codeforces.com/contest/459/problem/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        if (x1 == x2) {
            int side = Math.abs(y2 - y1);
            System.out.println(
                (x1 + side) + " " + y1 + " " +
                (x2 + side) + " " + y2
            );
        }
        else if (y1 == y2) {
            int side = Math.abs(x2 - x1);
            System.out.println(
                x1 + " " + (y1 + side) + " " +
                x2 + " " + (y2 + side)
            );
        }
        else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            System.out.println(
                x1 + " " + y2 + " " +
                x2 + " " + y1
            );
        }
        else {
            System.out.println("-1");
        }
    }
}
