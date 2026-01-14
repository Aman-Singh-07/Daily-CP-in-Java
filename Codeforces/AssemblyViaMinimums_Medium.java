// https://codeforces.com/contest/1857/problem/C

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=n*(n-1)/2;
            int[] b=new int[m];
            for(int i=0;i<m;i++) b[i]=input.nextInt();
            Arrays.sort(b);
            int x=n-1,i=0;
            while(x>0){
                System.out.print(b[i]+" ");
                i+=x;
                x--;
            }
            System.out.println(1000000000);
        }
    }
}
