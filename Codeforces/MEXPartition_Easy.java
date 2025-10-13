// https://codeforces.com/contest/2160/problem/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] freq=new int[101];
            for(int i=0;i<n;i++){
                int v=input.nextInt();
                freq[v]++;
            }
            for(int i=0;i<=100;i++){
                if(freq[i]==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
