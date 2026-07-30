// https://codeforces.com/contest/287/problem/A

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] grid = new char[4][4];
        for (int i = 0; i < 4; i++) {
            grid[i] = input.nextLine().toCharArray();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int blackCount = 0;
                for (int x = i; x < i + 2; x++) {
                    for (int y = j; y < j + 2; y++) {
                        if (grid[x][y] == '#') {
                            blackCount++;
                        }
                    }
                }
                if (blackCount != 2) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
