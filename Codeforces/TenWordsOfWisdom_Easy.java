// https://codeforces.com/problemset/problem/1850/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int max=0;
            int res=0;
            for(int i=0;i<n;i++){
                int a=input.nextInt();
                int b=input.nextInt();
                if(a<=10 && b>max){
                    max=b;
                    res=i+1;
                }
            }
            System.out.println(res);
        }
        
    }
}
