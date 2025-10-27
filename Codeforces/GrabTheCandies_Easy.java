// https://codeforces.com/problemset/problem/1807/B

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int even=0;
            int odd=0;
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                if(x%2!=0){
                    odd+=x;
                }
                else even+=x;
            }
            if(even>odd) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
