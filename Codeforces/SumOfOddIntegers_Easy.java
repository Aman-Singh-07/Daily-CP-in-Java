// https://codeforces.com/problemset/problem/1327/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextInt();
            long k=input.nextInt();
            if(n>=k*k && n%2==k % 2) System.out.println("YES");
            else System.out.println("NO");
           
        }
    }
}
