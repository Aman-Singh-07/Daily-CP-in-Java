// https://codeforces.com/contest/2190/problem/A

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String s = input.next();

            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (s.equals(sorted)) {
                System.out.println("Bob");
                continue;
            }
            ArrayList<Integer> list= new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != sorted.charAt(i)) {
                    list.add(i + 1);
                }
            }
            System.out.println("Alice");
            System.out.println(list.size());
            for(int idx:list){
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}
