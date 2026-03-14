// https://codeforces.com/problemset/problem/1702/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long res=1;
            while(res*10<=n){
                res*=10;
            }
            System.out.println(n-res);
        }
    }
}
