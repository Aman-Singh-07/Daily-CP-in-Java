// https://codeforces.com/problemset/problem/476/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int min=(n+1)/2;
        int res=-1;
        for(int i=min;i<=n;i++){
            if(i%m==0){
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}
