// https://codeforces.com/problemset/problem/327/A

import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        int ones=0;
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
            if(a[i]==1) ones++;
        }
        int[] gain=new int[n];
        for(int i=0;i<n;i++){
            gain[i]=(a[i]==0)?1:-1;
        }
        int maxGain=Integer.MIN_VALUE,current=0;
        for(int g:gain){
            current=Math.max(g,current+g);
            maxGain=Math.max(maxGain,current);
        }
        if(ones==n){
            System.out.println(n-1);
        }else{
            System.out.println(ones+maxGain);
        }
    }
}
