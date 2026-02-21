// https://codeforces.com/problemset/problem/1805/A

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int x=input.nextInt();
            for(int i=1;i<n;i++){
                int y=input.nextInt();
                x^=y;
            }
            if(n%2!=0) System.out.println(x);
            else{
                if(x==0) System.out.println(0);
                else System.out.println(-1);
            }
        }
    }
}
