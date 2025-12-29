// https://codeforces.com/problemset/problem/1369/A


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            if(n%4==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
