// https://codeforces.com/problemset/problem/2131/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            for(int j=0;j<n;j++){
                b[j]=input.nextInt();
            }
            int count=1;
            for(int i=0;i<n;i++){
                if(a[i]>b[i]) count+=a[i]-b[i];
                
            }
            System.out.println(count);
        }
    }
}
