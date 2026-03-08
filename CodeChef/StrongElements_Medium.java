// https://www.codechef.com/problems/STRNG?tab=statement

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            int[] pref=new int[n];
            int[] suff=new int[n];
            pref[0]=a[0];
            for(int i=1;i<n;i++){
                pref[i]=gcd(pref[i-1],a[i]);
            }
            suff[n-1]=a[n-1];
            for(int i=n-2;i>=0;i--){
                suff[i]=gcd(suff[i+1],a[i]);
            }
            int count=0;
            for(int i=0;i<n;i++){
                int excludedGcd;
                if(i==0){
                    excludedGcd=suff[1];
                }else if(i==n-1){
                    excludedGcd=pref[n-2];
                }else{
                    excludedGcd=gcd(pref[i-1],suff[i+1]);
                }
                if(excludedGcd>1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static int gcd(int a,int b){
        while(b!=0){
            a%=b;
            int temp=a;
            a=b;
            b=temp;
        }
        return a;
    }
}
