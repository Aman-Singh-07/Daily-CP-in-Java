// https://codeforces.com/problemset/problem/1722/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int t=input.nextInt();
       while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            if(n!=5){
                System.out.println("NO");
                continue;
            }
            char[] original="Timur".toCharArray();
            Arrays.sort(original);
            char[] current=s.toCharArray();
            Arrays.sort(current);
            if (Arrays.equals(original, current)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
