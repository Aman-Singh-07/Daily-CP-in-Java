// https://codeforces.com/problemset/problem/279/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int t=input.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int l=0,sum=0,maxBooks=0;
        for(int r=0;r<n;r++){
            sum+=a[r];
            while(sum>t){
                sum-=a[l];
                l++;
            }
            maxBooks=Math.max(maxBooks,r-l+1);
        }

        System.out.println(maxBooks);
    }
}
