// https://codeforces.com/contest/2158/problem/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] freq=new int[2*n+1];
            for(int i=0;i<2*n;i++){
                int x=input.nextInt();
                freq[x]++;
            }
            int count1=0;
            int count2=0;
            for(int i=1;i<2*n+1;i++){
                if(freq[i]>0){
                if(freq[i]%2!=0) count1++;
                else count2++;
                }
            }
            int res=count1+2*count2;
            if(count1==0 && count2%2!=n%2) res-=2;
            System.out.println(res);
            
        }
    }
}
