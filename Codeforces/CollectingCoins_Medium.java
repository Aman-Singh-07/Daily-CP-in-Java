// https://codeforces.com/problemset/problem/1294/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int n=input.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int needed=(max-a)+(max-b)+(max-c);
            if(n>=needed && (n-needed)%3==0){
                System.out.println("YES");
            }else System.out.println("NO");
        }

    }
}
