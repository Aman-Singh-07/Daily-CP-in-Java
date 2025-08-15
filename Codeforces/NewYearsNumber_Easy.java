// https://codeforces.com/problemset/problem/1475/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            boolean isTrue=false;
            for(int i=0;i<=n/2021;i++){
                if((n-2021*i)%2020==0){
                    isTrue=true;
                    break;
                }
            }
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
