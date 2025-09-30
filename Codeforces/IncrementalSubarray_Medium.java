// https://codeforces.com/problemset/problem/2151/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            int[] a=new int[m];
            int maxn=0;
            for(int i=0;i<m;i++){
                a[i]=input.nextInt();
                maxn=Math.max(maxn, a[i]);
            }
            boolean isTrue=false;
            for(int i=1;i<m;i++){
                if(a[i]!=a[i-1]+1){
                    System.out.println(1);
                    isTrue=true;
                    break;
                }
                
            } if(!isTrue) System.out.println(n-maxn+1);
        }
    }
}
