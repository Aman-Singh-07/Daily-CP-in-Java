// https://codeforces.com/problemset/problem/1560/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int d=Math.abs(a-b);
            int n=2*d;
            if(a>n || b>n || c>n){
                System.out.println(-1);
                continue;
            }
            int res=(c+d<=n)?c+d:c-d;
            System.out.println(res);
        }
    }
}
