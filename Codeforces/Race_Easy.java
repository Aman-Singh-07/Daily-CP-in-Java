// https://codeforces.com/problemset/problem/2112/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n-->0){
            int a=input.nextInt();
            int x=input.nextInt();
            int y=input.nextInt();
            boolean possible=false;
            for(int b=1;b<=100;b++){ 
                if(b==a) continue;
                if(Math.abs(b-x)<Math.abs(a-x) &&
                    Math.abs(b-y)<Math.abs(a-y)){
                    possible=true;
                    break;
                }
            }

            System.out.println(possible?"YES":"NO");
        }
    }
}
