// https://codeforces.com/contest/1742/problem/D

import java.util.*;

class CodeChef{

    static int gcd(int a, int b){
        while(b != 0){
            int t = a%b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            int[] a = new int[1001];

            for(int i = 1; i <= n; i++){
                int v = fs.nextInt();
                a[v] = i;
            }

            int ans = -1;
            for(int i = 1; i <= 1000; i++){
                if(a[i] == 0)
                    continue;
                for(int j = 1; j <= 1000; j++){
                    if(a[j] == 0)
                        continue;
                    if(gcd(i,j) == 1)
                        ans = Math.max(ans, a[i] + a[j]);
                }
            }

            System.out.println(ans);
        }
    }
}
