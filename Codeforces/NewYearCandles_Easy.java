// https://codeforces.com/problemset/problem/379/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int res=a;
        int count=res;
        while(res>=b){
            int prev=res;
            res=res/b;
            count+=res;
            res+=prev%b;
        }
        System.out.println(count);
    }
}
