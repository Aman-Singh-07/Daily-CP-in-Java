// https://codeforces.com/problemset/problem/2208/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int totalCandies=n*n;
            int[] freq=new int[totalCandies+1];
            int maxFreq=0;
            for(int i=0;i<totalCandies;i++){
                int color=input.nextInt();
                freq[color]++;
                if(freq[color]>maxFreq){
                    maxFreq=freq[color];
                }
            }
            if(n==1){
                System.out.println("NO");
            }else if(maxFreq>totalCandies-n){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
