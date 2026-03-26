// https://codeforces.com/problemset/problem/2208/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int p = input.nextInt();
            int m = input.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(input.nextInt());
            }
            int targetIndex = p - 1; 
            int energyUsed = 0;
            int wins = 0;
            while (true) {
                if (targetIndex < k) {
                    int cost = list.get(targetIndex);
                    if (energyUsed + cost > m) break;
                    energyUsed += cost;
                    wins++;
                    list.add(list.remove(targetIndex));
                    targetIndex = n - 1; 
                } else {
                    int minCost = Integer.MAX_VALUE;
                    int minIndex = -1;
                    for (int i = 0; i < k; i++) {
                        if (list.get(i) < minCost) {
                            minCost = list.get(i);
                            minIndex = i;
                        }
                    }
                    if (energyUsed + minCost > m) break;
                    energyUsed += minCost;
                    list.add(list.remove(minIndex));
                    targetIndex--; 
                }
            }
            System.out.println(wins);
        }
    }
}
