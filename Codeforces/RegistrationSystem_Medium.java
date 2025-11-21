//  https://codeforces.com/problemset/problem/4/C

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n =input.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = input.next();
            if (!map.containsKey(name)) {
                System.out.println("OK");
                map.put(name, 0);
            } else {
                int count = map.get(name) + 1;
                String newName = name + count;
                while (map.containsKey(newName)) {
                    count++;
                    newName = name + count;
                }
                System.out.println(newName);
                map.put(name, count);
                map.put(newName, 0);
            }
        }
    }
}
