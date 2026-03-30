// https://codeforces.com/problemset/problem/2157/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] freq=new int[101];
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                freq[x]++;
            }
            int count=0;
            for(int i=0;i<=100;i++){
                if(freq[i]!=(i) && freq[i]>0){
                    if(freq[i]<i) count+=freq[i];
                    else count+=freq[i]-i;
                }
            }
            System.out.println(count);
        }
    }
}
