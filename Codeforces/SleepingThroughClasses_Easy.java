// https://codeforces.com/problemset/problem/2173/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            String s=input.next();
            boolean[] awake=new boolean[n];
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    awake[i]=true;
                    for(int j=1;j<=k && i+j<n;j++){
                        awake[i+j]=true;
                    }
                }
            }
            int sleepCount = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0' && !awake[i]){
                    sleepCount++;
                }
            }
            System.out.println(sleepCount);
        }
    }
}
